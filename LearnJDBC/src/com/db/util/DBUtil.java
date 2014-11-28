package com.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String USERNAME = "root";
	private static final String PASSWORD = "admin";
	private static final String CONN_STRING = "jdbc:mysql://localhost/student";

	public static final Connection getConnection(DBtype dbtype)
			throws SQLException {
		switch (dbtype) {
		case MYSQL:
			return (Connection) DriverManager.getConnection(CONN_STRING,
					USERNAME, PASSWORD);

		case HSQL: // return connection statement for HSQL
		case ORACLE: // return connection statement for ORACLE
		default:
			return null;
		}
	}
	public static void processException(SQLException e){
		System.out.println("Error Message : " +e.getMessage());
		System.out.println("Error Code : " +e.getErrorCode());
		System.out.println("SQL State : " +e.getSQLState());
		
	}

}
