package com.tvdat.dp.SingleTon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final class Singleton_Connection {
	private static Singleton_Connection _instance = null;
	private Connection cnn = null;
	
	public Connection getConnection() {
		return this.cnn;
	}
	private Singleton_Connection() {
		String connectionUrl = "jdbc:sqlite:/Users/spiderman/Desktop/Code/Java/SQLife/tranhieutai.db";
		try {
			this.cnn = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Singleton_Connection getInstance() {
		if(this._instance == null) {
			_instance = new Singleton_Connection();
		}
		return this._instance;
	}
}
