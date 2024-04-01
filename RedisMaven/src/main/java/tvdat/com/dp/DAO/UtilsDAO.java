package tvdat.com.dp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final class DBSinhVien {
	private Connection con = null;
	private static DBSinhVien _instance = null;
	public Connection getConnection() {
		return this.con;
	}
	private DBSinhVien() {
		String connectionUrl = "jdbc:sqlite:/Users/spiderman/Desktop/Code/Java/SQLife/tranhieutai.db";
		try {
			con = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static DBSinhVien getInstance() {
		if(_instance == null) {
			_instance = new DBSinhVien();
		}
		return _instance;
	}
}
























 