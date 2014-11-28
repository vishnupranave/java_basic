package com.learnconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.table.Student_details;
import com.db.util.DBUtil;
import com.db.util.DBtype;
import com.mysql.jdbc.PreparedStatement;

public class LearnPreparedStatement {
	private final static String SQL_STMT = "SELECT * FROM student_details WHERE studentId = ?";

	public static void main(String[] args) throws SQLException {
		ResultSet rs = null;

		try (Connection conn = DBUtil.getConnection(DBtype.MYSQL);
				PreparedStatement ps = (PreparedStatement) conn
						.prepareStatement(SQL_STMT);) {
			System.out.println("Enter the Student Id: ");
			 Scanner scan = new Scanner(System.in);
			 int s = scan.nextInt();
			 ps.setInt(1, s);
			rs = ps.executeQuery();
			Student_details.displayData(rs);
		} catch (SQLException e) {
			DBUtil.processException(e);
		} finally {
			if (rs != null)
				rs.close();
		}
	}

}
