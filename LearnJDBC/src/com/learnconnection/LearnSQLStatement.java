package com.learnconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LearnSQLStatement {

	private final static String USERNAME = "root";
	private final static String PASSWORD = "admin";
	private final static String CONN_STRING = "jdbc:mysql://127.0.0.1/student";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = (Connection) DriverManager.getConnection(CONN_STRING,
					USERNAME, PASSWORD);
			System.out.println("Connection Established.");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * from student_details");
			rs.last();
			System.out.println("No of rows = "+ rs.getRow());

			
		} catch (SQLException e) {

			System.err.println(e);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

	}

}
