package com.app.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private final static String URL="jdbc:mysql://localhost/scdl";
	private final static String USER_NAME="root";
	private final static String PASS="1207";
	private static Connection con;
	static {
		try {
			Class.forName("con.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.err.println("driver not found");
			e.printStackTrace();
		}
	}
	public static Connection getConnection()throws SQLException {
		if(con==null) {	
		synchronized(DBUtil.class){
			if(con==null)
				con=DriverManager.getConnection(URL,USER_NAME,PASS);

		}
		}
		return con;
	}
}
