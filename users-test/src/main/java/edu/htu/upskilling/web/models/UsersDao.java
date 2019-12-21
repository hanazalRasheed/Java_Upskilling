package edu.htu.upskilling.web.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDao extends GeneralDao {

	public void add(User user) throws SQLException {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = getConnection();
			ps = connection.prepareStatement("INSERT INTO sec_users (user_name,user_password) VALUES (?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			ps.executeUpdate();
		} finally {
			close(connection, ps);
		}
	}

	public User find(String userName) throws SQLException {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = getConnection();
			ps = connection.prepareStatement("SELECT * FROM sec_users WHERE user_name=?");
			ps.setString(1, userName);
			rs = ps.executeQuery();
			if (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("user_id"));
				user.setName(rs.getString("user_name"));
				user.setPassword(rs.getString("user_password"));
				return user;
			}
			return null;
		} finally {
			close(connection, ps, rs);
		}
	}

	public static void main(String[] args) {
		UsersDao dao = new UsersDao();
		try {
			//dao.add(new User("admin", "admin123"));
			User user = dao.find("admin");
			System.out.println(user);
			System.out.println("Succ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
