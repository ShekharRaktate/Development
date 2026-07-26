package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;

public class PrepaedStatementDemo {
	public static void main(String[] args) {
		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/scdl", "root", "1207");
			Scanner sc = new Scanner(System.in);
			PreparedStatement pstmt = null;
			System.out.println("Enter Student Id:");
			int id = sc.nextInt();
//			sc.nextLine();
			System.out.println("Enter Student Name:");
			String name = sc.next();
			System.out.println("Enter Student Marks:");
			float marks = sc.nextFloat();
			System.out.println("Enter Student MobliNo:");
			long mobile = sc.nextLong();
			pstmt = con.prepareStatement("insert into student values(?,?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setFloat(3, marks);
			pstmt.setLong(4, mobile);
			int row = pstmt.executeUpdate();
			System.out.println(row + "row is inserted...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
