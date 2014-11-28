package com.learnconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.util.DBUtil;
import com.db.util.DBtype;

public class ConnectMySQL {
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection(DBtype.MYSQL);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * from student_details");
			while(rs.next()){
				System.out.println("Student ID: "+rs.getString("studentId"));
				System.out.println("Name: "+rs.getString("firstName") + rs.getString("lastName"));
				System.out.println("Roll No: "+rs.getString("rollNo"));
				System.out.println("Class: "+rs.getString("className"));
				System.out.println("Section: "+rs.getString("sectionName"));
			}

		} catch (SQLException e) {
			DBUtil.processException(e);
		} finally {

			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();

		}
	}

}
