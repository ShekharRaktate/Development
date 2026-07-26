package com.app.Dao;
import com.app.model.Student;
import com.app.util.*;
import com.app.controller.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
    Connection con=null;
    Statement stmt=null;
    public StudentDao(){
    	try {
    		con=DBUtil.getConnection();
    		stmt=con.createStatement();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public int insertData(Student st){
    	try {
    		return stmt.executeUpdate("insert into student values("+st.getId()+","+st.getName()+","+st.getMarks()+","+st.getMobile()+")");
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return 0;
        
    }
    public int updateData(Student student) {
    	try {
    		return stmt.executeUpdate("update student set marks="+student.getMarks()+"where id="+student.getId());
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return 0;
    }
    public int deleteById(int id) {
    	try {
    		return stmt.executeUpdate("delete from student where id="+id);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return 0;
    	
    }
    public Student findById(int id) {

    	try {
    		ResultSet rs=stmt.executeQuery("select * from student where id="+id);
        	while(rs.next()) {
        		student.setId(rs.getInt(1));
        		student.setName(rs.getString(2));
        		student.setMarks(rs.getFloat(3));
        		student.setMobile(rs.getLong(4));
        	}
    	}catch(Exception e) {
    		System.out.println("record not found");
    		e.printStackTrace();
    	}
    	return student;
    }
}
