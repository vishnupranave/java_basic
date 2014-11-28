package com.db.table;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Student_details {
	public static void displayData(ResultSet rs) throws SQLException {
		if (rs == null) {
			System.out.println("No data found!");
		} else {
			while (rs.next()) {
				System.out.println("Student ID: " + rs.getString("studentId"));
				System.out.println("Name: " + rs.getString("firstName")
						+ rs.getString("lastName"));
				System.out.println("Roll No: " + rs.getString("rollNo"));
				System.out.println("Class: " + rs.getString("className"));
				System.out.println("Section: " + rs.getString("sectionName"));
			}
		}

	}
}
