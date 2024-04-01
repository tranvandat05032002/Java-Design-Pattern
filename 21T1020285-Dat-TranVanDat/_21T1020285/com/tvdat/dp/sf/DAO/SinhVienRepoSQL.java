package com.tvdat.dp.sf.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.tvdat.dp.sf.MODELS.SinhVien;


public class SinhVienRepoSQL implements SinhVienRepo {
	private static Connection cnn = null;
	public SinhVienRepoSQL(String cnnString) {
		this.cnn = SinhVienDB.getInstance(cnnString).getConnection();
	}
	public void insertSinhVien(SinhVien sv) {
        try {
        	String queryString = "INSERT INTO SinhVien VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = this.cnn.prepareStatement(queryString);
            int index = 1;
            Format formatter = new SimpleDateFormat("yyyy-MM-dd");
            String svDate = formatter.format(sv.getNgaySinh());
            pstmt.setString(index++, sv.getMaSinhVien());
            pstmt.setString(index++, sv.getHoTen());
            pstmt.setBoolean(index++, sv.isGioiTinhNam());
            pstmt.setString(index++, svDate);
            int n = pstmt.executeUpdate();
            pstmt.close();
            if(n == 1) {
            	System.out.println("Them sinh vien thanh cong!!!");
            }
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Sinh vien da ton tai trong DB!!!");
		}
	}

	public ArrayList<SinhVien> getSinhVien() throws SQLException {
		Statement stmt = this.cnn.createStatement();
		String queryGetListSinhVien = "SELECT * FROM SinhVien";

		ResultSet rs = stmt.executeQuery(queryGetListSinhVien);
		ArrayList<SinhVien> lst = new ArrayList();
		while (rs.next()) {
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date dateDB = formatter.parse(rs.getString("NgaySinh"));
				SinhVien x = new SinhVien(rs.getString("MaSinhVien"), rs.getString("HoTen"), rs.getBoolean("GioiTinhNam"), dateDB);
				lst.add(x);
				rs.close();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lst;
	}

	public void deleteSinhVien(String MaSinhVien) {
		try {
        	String queryString = "DELETE FROM SinhVien "
        					   + "WHERE MaSinhVien = ? ";
            PreparedStatement pstmt = this.cnn.prepareStatement(queryString);
            pstmt.setString(1, MaSinhVien);
            int n = pstmt.executeUpdate();
            pstmt.close();
            if(n == 1) {
            	System.out.println("Xoa sinh vien thanh cong!!!");
            }
		} catch (SQLException e) {
			System.out.println("Sinh vien khong ton tai trong DB!!!");
		}
		
	}
}
