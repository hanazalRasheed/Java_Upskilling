package project;

import java.sql.*;

public  class MySqlConnection  {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","123456");
			System.out.println("Done");
		
		return con;
	}
	
	
	
	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}