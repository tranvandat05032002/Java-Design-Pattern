package tvdat.com.dp.UI;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import tvdat.com.dp.DAO.NhanVienDAO;
import tvdat.com.dp.MODELS.NhanVien;


public class ChuongTrinh {
	public void getListNhanVien() {
		NhanVienDAO dao = new NhanVienDAO();
			try {
				for(int i = 0; i < dao.GetListSinhVien().size(); i++) {
					NhanVien nv = dao.GetListSinhVien().get(i);
					System.out.println(nv.getHoTen());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public void getSearchNhanVien(String searchQuery) {
		NhanVienDAO dao = new NhanVienDAO();
		 ArrayList<NhanVien> searchResult;
		try {
			searchResult = dao.searchNhanVien(searchQuery);
			 for (NhanVien nhanVien : searchResult) {
		            System.out.println("Ma Nhan Vien: " + nhanVien.getMaNhanVien() + ", Ten: " + nhanVien.getHoTen() + ", HSL: " + nhanVien.getHeSoLuong());
		        }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getSearchNhanVienUseRedis(String searchQuery) {
		NhanVienDAO dao = new NhanVienDAO();
		try {
			return dao.searchNhanVienUseRedis(searchQuery);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		ChuongTrinh ct = new ChuongTrinh();
//		 jedis.set("foo", "bar");
//         System.out.println(jedis.get("foo"));
//		ct.getListNhanVien();
//		NhanVienDAO dao = new NhanVienDAO();
//		dao.testRedisConnect();
//		ct.getSearchNhanVien("nguyenthihanh");
//		ct.getSearchNhanVien("nguyenthihanh");
//		ArrayList<Number> lstStr = new ArrayList<Number>();
//		lstStr.add(1);
//		lstStr.add(2);
//		lstStr.add(3);
//		
//		try {
//			 ObjectMapper objectMapper = new ObjectMapper();
//			 String jsonArray = objectMapper.writeValueAsString(lstStr);
//			 for(int i = 0; i < jsonArray.length(); i++)  {
//				 System.out.println(jsonArray.);
//			 }
//			 System.out.println(jsonArray);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	        
		System.out.println(ct.getSearchNhanVienUseRedis("nugyenthithanh"));

        // Chuyển đổi JSON thành một đối tượng Java
//        MyObject myObjectFromJson = objectMapper.readValue(json, MyObject.class);
//        System.out.println("Object: " + myObjectFromJson);	
	}
}
