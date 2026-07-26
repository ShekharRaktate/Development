package com.app;
import java.sql.*;

public class DDLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Register Successfully!");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scdl","root","1207");
			System.out.println("Connection created sucessfully");
//			Step:3
			Statement stmt=con.createStatement();
			System.out.println("Statement obj creatred ");
//			step:4
			stmt.execute("CREATE TABLE Student(id int,name varchar(20),marks float,mobile bigint)");
			System.out.println("Table created successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
