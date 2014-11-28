package com.learnconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LearnConnection {

	private final static String USERNAME = "root";
	private final static String PASSWORD = "admin";
	private final static String CONN_STRING = "jdbc:mysql://127.0.0.1/student";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection(CONN_STRING,
					USERNAME, PASSWORD);

			System.out.println("Connection Established.");
		} catch (SQLException e) {

			System.err.println(e);
		} finally {
			if (conn != null) {
				conn.close();
			}
		}

	}
}
