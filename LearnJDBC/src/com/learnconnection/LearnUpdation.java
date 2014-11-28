package com.learnconnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.util.DBUtil;
import com.db.util.DBtype;
import com.mysql.jdbc.PreparedStatement;

public class LearnUpdation {

	private static final String SQL_STMT = "UPDATE courses SET courseName=? where courseId=?";

	public static void main(String[] args) {
		try(Connection conn = DBUtil.getConnection(DBtype.MYSQL);
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(SQL_STMT);
				){
			System.out.println("Enter the Course Id: ");
			Scanner scan = new Scanner(System.in);
			int courseId = scan.nextInt();
			System.out.println("Enter the new Course Name: ");
			String courseName = scan.next();
			
			ps.setString(1, courseName);
			ps.setInt(2, courseId);
			
			int rs = ps.executeUpdate();
			if(rs==0){
				System.out.println("No record updated.");
			}
			else{
				System.out.println(rs+" record updated.");
			}
		}catch(SQLException e){
			DBUtil.processException(e);
		}
	}
}
