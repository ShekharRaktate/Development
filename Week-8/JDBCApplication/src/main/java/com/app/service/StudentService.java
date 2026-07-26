package com.app.service;
import com.app.dto.*;
import com.app.Dao.*;
import com.app.model.*;

import java.sql.ResultSet;
import java.util.*;


public class StudentService {
	StudentDto dto=new StudentDto();
	StudentDao dao=new StudentDao();
	
	public int addStudent() {
		Student st=dto.getStudentData();
		int result =dao.insertData(st);
		return result;
	}
	public int  updateStudent() {
		Student student=dto.updateStudent();
		int result =dao.updateData(student);
		return result;
	}
	public String  deleteStudent() {
		int id=dto.getId();
		int result =dao.deleteById(id);
		if(result!=0)
			return "record Deleted suceessfully by user id:"+id;
		return "Data is not present please check once....!";
	
	}
	public Student searchById() {
		int  id=dto.getId();
		return dao.findById(id);
	}
	public List<Student> findAll(){
		return dao.findAll();
	}
}
