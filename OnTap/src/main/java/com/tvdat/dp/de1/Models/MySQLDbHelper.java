package com.tvdat.dp.de1.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final class MySQLDbHelper {
	private static MySQLDbHelper _instance = null;
	private Connection cnn = null;
	private static String url = "jdbc:mysql://localhost;3306/SinhVienDB"; //"jdbc:mysql://localhost:3306/Order"
    private static String user = "tranvandat";
    private static String password = "123";
	private MySQLDbHelper(String url) {
		try {
			this.cnn = DriverManager.getConnection(url, this.user, this.password);
			System.out.println("Connect success!!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return this.cnn;
	}
	public static MySQLDbHelper getInstance(String url) {
		if(_instance == null) {
			_instance = new MySQLDbHelper(url);
		}
		return _instance;
	}
}
