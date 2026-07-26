package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcess 
{
    public static void main( String[] args )
    {
    	try {
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scdl","root","1207");
//        create statement
    		Statement stmt=con.createStatement();
//        disable auto commit
    		con.setAutoCommit(false);
//        add non-select queries to batch
    		stmt.addBatch("INSERT INTO student_info VALUES (161,'Shekhar','dddd','1234567890','Male'),"
    				+ "(163,'Shekhaar','dddd','1234567890','Male')," 
    				+ "(160,'Shekhar','dddd','1234567890','Male')");
    		stmt.addBatch("update employee set name='Kinjal' where id=101");
    		stmt.addBatch("delete from course where id=101");
    		
    		int result[]=stmt.executeBatch();
    		boolean flag=false;
    		for(int i=0;i<result.length;i++) {
    			if(result[i]==0) {
    				flag=true;
    				break;
    			}
    		}
    		if(flag==true) {
    			con.rollback();
    			System.out.println("Tx rollback");
    		}
    		else {
    			con.commit();
    			System.out.println("tx Confirmed");
    		}
    		stmt.close();
    		con.close();
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}
