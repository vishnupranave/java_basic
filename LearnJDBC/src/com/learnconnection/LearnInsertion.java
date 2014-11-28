package com.learnconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.util.DBUtil;
import com.db.util.DBtype;
import com.mysql.jdbc.PreparedStatement;

public class LearnInsertion {
	private static final String SQL_STMT = "INSERT INTO courses(courseId,courseName) values (?, ?)";

	public static void main(String[] args) throws SQLException {

		try (Connection conn = DBUtil.getConnection(DBtype.MYSQL);
				PreparedStatement ps = (PreparedStatement) conn
						.prepareStatement(SQL_STMT);

		) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Course Id: ");
			int courseId = scan.nextInt();

			System.out.println("Enter Course Name: ");
			String courseName = scan.next();

			ps.setInt(1, courseId);
			ps.setString(2, courseName);

			int rs = ps.executeUpdate();
			if (rs == 0) {
				System.out.println("No Insertion");
			} else {
				System.out.println("Insertion Sucessfully Completed");
			}

		} catch (SQLException e) {
			DBUtil.processException(e);

		} finally {

		}

	}
}
