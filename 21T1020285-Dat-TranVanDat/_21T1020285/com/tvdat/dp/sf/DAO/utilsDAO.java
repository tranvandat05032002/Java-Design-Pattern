package com.tvdat.dp.sf.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final class SinhVienDB {
	private static SinhVienDB _instance = null;
	private Connection cnn = null;
	public Connection getConnection() {
		return this.cnn;
	}
	private SinhVienDB(String path) {
		String connectionUrl = path;
		try {
			cnn = DriverManager.getConnection(connectionUrl);
			System.out.println("Connect success!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SinhVienDB getInstance(String path) {
		if(_instance == null) {
			_instance = new SinhVienDB(path);
		}
		return _instance; 
	}
}
