package com.learnconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.table.Student_details;
import com.db.util.DBUtil;
import com.db.util.DBtype;
import com.mysql.jdbc.CallableStatement;

public class LearnStoredProcedure {

	private static final String SQL_STMT = "call GetDetailsByRoll( ? ) ";

	public static void main(String[] args) throws SQLException {
		ResultSet rs = null;
		try (Connection conn = DBUtil.getConnection(DBtype.MYSQL);
				CallableStatement stmt = (CallableStatement) conn
						.prepareCall(SQL_STMT);) {
			System.out.println("Enter the Student Roll No: ");
			Scanner scan = new Scanner(System.in);
			int roll = scan.nextInt();
			stmt.setInt(1, roll);
			rs = stmt.executeQuery();
			Student_details.displayData(rs);

		} catch (SQLException e) {
			DBUtil.processException(e);
		} finally {
			if (rs != null)
				rs.close();
		}
	}
}
