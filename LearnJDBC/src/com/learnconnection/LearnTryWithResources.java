package com.learnconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.util.DBUtil;
import com.db.util.DBtype;

public class LearnTryWithResources {

	public static void main(String[] args) {

		try (Connection conn = DBUtil.getConnection(DBtype.MYSQL);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt
						.executeQuery("SELECT * from student_details");) {

			rs.last();
			System.out.println("No of rows = " + rs.getRow());

		} catch (SQLException e) {

			DBUtil.processException(e);
		}
	}
}
