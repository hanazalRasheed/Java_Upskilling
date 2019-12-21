package edu.htu.upskilling.web.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeneralDao {
	private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/hr_test";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "123456";

	static {
		try {
			Class.forName(MYSQL_DRIVER);
		} catch (ClassNotFoundException e) {
			System.exit(1);
		}
	}

	protected Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return connection;
	}

	public static void main(String[] args) {
		GeneralDao dao = new GeneralDao();
		try {
			dao.getConnection();
			System.out.println("Done");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void close(Connection connection, PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	protected void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(connection, ps);
	}

}
