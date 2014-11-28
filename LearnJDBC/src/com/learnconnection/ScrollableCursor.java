package com.learnconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.table.Courses;
import com.db.util.DBUtil;
import com.db.util.DBtype;

public class ScrollableCursor {
	public static void main(String[] args) {
		try (Connection conn = DBUtil.getConnection(DBtype.MYSQL);
				Statement stmt = conn.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt
						.executeQuery("SELECT courseID, courseName from courses");) {
			Courses.displayData(rs);
			rs.last();
			System.out.println("No of rows = " + rs.getRow());
			rs.first();
			System.out.println("The first course name =  "
					+ rs.getString("courseName"));
			rs.absolute(5);
			System.out.println("The fifth course name =  "
					+ rs.getString("courseName"));

		} catch (SQLException e) {
			DBUtil.processException(e);
		}
	}

}
