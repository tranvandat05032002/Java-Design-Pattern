package tvdat.com.dp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
	
import org.json.JSONArray;

import redis.clients.jedis.Jedis;
import tvdat.com.dp.MODELS.NhanVien;

public class NhanVienDAO {
	private ArrayList<NhanVien> cachedResult = null; // 1
	private static Date lastBuildCache = null;
//	private Jedis jedis = null;
	private static Hashtable<String, ArrayList<NhanVien>> cacheHash = new Hashtable<>();

	public ArrayList<NhanVien> GetListSinhVienBasic() throws Exception {
		Date currentDate = new Date();
		if (cachedResult != null && (lastBuildCache.getTime() + (1000 * 60 + 30)) >= currentDate.getTime()) {
			System.out.println("Cache data to cachedResult");
			return cachedResult;
		}
		System.out.println("Running cache");
		Connection con = (DBSinhVien.getInstance()).getConnection();
		Statement stmt = con.createStatement();
		String queryGetListNhanVien = "SELECT * FROM NhanVien";

		ResultSet rs = stmt.executeQuery(queryGetListNhanVien);
		ArrayList<NhanVien> lst = new ArrayList<>();
		while (rs.next()) {
			NhanVien x = new NhanVien(rs.getString("maNhanVien"), rs.getString("hoTen"), rs.getString("loaiHopDong"),
					rs.getInt("heSoLuong"));
			lst.add(x);
		}
		// Thread.sleep(10000);
		lastBuildCache = new Date();
		cachedResult = lst;
		return lst;
	}

	public ArrayList<NhanVien> GetListSinhVien() throws Exception {
		if (cachedResult != null) {
			System.out.println("Lấy dữ liệu từ cache");
			;
			return cachedResult;
		} else {
			System.out.println("Lưu dữ liệu vào cache");
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Connection con = null;
//			Statement stmt = con.createStatement();
			try {
				con = (DBSinhVien.getInstance()).getConnection();
				String queryGetListNhanVien = "SELECT * FROM NhanVien";
				pstmt = con.prepareStatement(queryGetListNhanVien);
				rs = pstmt.executeQuery();

				ArrayList<NhanVien> lst = new ArrayList<>();
				while (rs.next()) {
					NhanVien x = new NhanVien(rs.getString("maNhanVien"), rs.getString("hoTen"),
							rs.getString("loaiHopDong"), rs.getInt("heSoLuong"));
					lst.add(x);
				}

				Thread.sleep(10000);
				cachedResult = lst;
				return lst;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cachedResult;
	}

	@SuppressWarnings("unused")
	public ArrayList<NhanVien> searchNhanVien(String searchQuery) throws InterruptedException {
		ArrayList<NhanVien> lst = new ArrayList<>();
		if (cacheHash.containsKey(searchQuery)) {
			System.out.println("Lấy dữ liệu cache");
			return cacheHash.get(searchQuery);
		} else {
			System.out.println("Lưu vào cache");
			Thread.sleep(10000);
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Connection con = null;
			try {
				String queryString = "select *\n" + "from NhanVien\n" + "where hoTen like ?";

				con = (DBSinhVien.getInstance().getConnection());
				pstmt = con.prepareStatement(queryString);
				pstmt.setString(1, "%" + searchQuery + "%");
				rs = pstmt.executeQuery();
				while (rs.next()) {
					NhanVien x = new NhanVien(rs.getString("maNhanVien"), rs.getString("hoTen"),
							rs.getString("loaiHopDong"), rs.getInt("heSoLuong"));
					lst.add(x);
				}
				cacheHash.put(searchQuery, lst);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return lst;
		}
	}

	public void testRedisConnect() {
		Jedis jedis = RedisConnection.getInstance().getJedisConnection();
		jedis.set("foo", "TranVanDat");
		System.out.println(jedis.get("foo"));
	}

	public String searchNhanVienUseRedis(String searchQuery) throws Exception {
		Jedis jedis = RedisConnection.getInstance().getJedisConnection();
		ArrayList<NhanVien> lst = new ArrayList<>();
		JSONArray mJSONArray = null;
		if (jedis.exists(searchQuery)) {
			System.out.println("Lấy dữ liệu redis");
			return jedis.get(searchQuery);
		} else {
			System.out.println("Lưu vào redis");
			Thread.sleep(5000);
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Connection con = null;

			try {
				String queryString = "select *\n" + "from NhanVien\n" + "where hoTen like ?";

				con = (DBSinhVien.getInstance().getConnection());
				jedis = RedisConnection.getInstance().getJedisConnection();
				pstmt = con.prepareStatement(queryString);
				pstmt.setString(1, "%" + searchQuery + "%");
				rs = pstmt.executeQuery();
				while (rs.next()) {
					NhanVien x = new NhanVien(rs.getString("maNhanVien"), rs.getString("hoTen"),
							rs.getString("loaiHopDong"), rs.getInt("heSoLuong"));
					lst.add(x);
				}
//  			don't check is empty array
					mJSONArray = new JSONArray(Arrays.asList(lst));
					System.out.println(mJSONArray);
					jedis.set(searchQuery, mJSONArray.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return mJSONArray.toString();			
		}
	}
}
