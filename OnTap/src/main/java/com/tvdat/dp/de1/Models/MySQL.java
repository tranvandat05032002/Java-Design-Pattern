package com.tvdat.dp.de1.Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQL implements ConnectMethod {
	private static String path;
	private static Connection cnn = null;
	public MySQL(String path) {
		this.path = path;
	}
	@Override
	public ArrayList<SinhVien> getAllSinhVien() {
		this.cnn = MySQLDbHelper.getInstance(this.path).getConnection();
		ArrayList<SinhVien> lst = new ArrayList<SinhVien>();
		String queryString = "SELECT * FROM SinhVien";
		Statement stmt;
		try {
			stmt = this.cnn.createStatement();
			ResultSet rs = stmt.executeQuery(queryString);
			while(rs.next()) {
				// get value in MySQL
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}

	@Override
	public void insertSinhVien(SinhVien newSinhVien) {
		
	}

	@Override
	public void deleteSinhVien(String maSinhVien) {
		// TODO Auto-generated method stub
	}

}
