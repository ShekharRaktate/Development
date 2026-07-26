package com.app.controller;
import com.app.dto.StudentDto;
import java.util.List;
import com.app.model.Student;
import com.app.service.StudentService;

public class StudentController {
		StudentService service=new StudentService();
		StudentDto dto=new StudentDto();
		public void addStudent() {
			int result =service.addStudent();
			if(result!=0) {
				System.out.println(result+"Student created successfully  !");
			}else {
				System.out.println("Something went wrong ");
			}
		}
		public void updateStudent() {
			int result =service.updateStudent();
			if(result!=0) {
				System.out.println(result+"");
			}else {
				System.out.println("");
			}
		}
		public void deleteStudent() {
			String msg =service.deleteStudent();
		}
		public void studentById() {
			Student st=service.searchById();
			System.out.println(st);
		}
		public void student() {
			List<Student>list=service.findAll();
			for(Student s:list) {
				
				System.out.println(s);
			}
		}
}
