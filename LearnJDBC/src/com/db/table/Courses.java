package com.db.table;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Courses {
	public static void displayData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.println("Course ID : " + rs.getInt("courseID"));
			System.out.println("Course Name : " + rs.getString("courseName"));
		}
	}
}
