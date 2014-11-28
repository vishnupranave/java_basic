package com.learnconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.table.Student_details;
import com.db.util.DBUtil;
import com.db.util.DBtype;

public class UsingLoops {

	public static void main(String[] args) {

		try (Connection conn = DBUtil.getConnection(DBtype.MYSQL);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt
						.executeQuery("SELECT * from student_details");) {

			while (rs.next()) {
				Student_details.displayData(rs);
				
			}

		} catch (SQLException e) {

			DBUtil.processException(e);
		}
	}
}
