package com.app.dto;
import com.app.model.*;
import java.util.Scanner;

public class StudentDto {
	Student st=new Student();
	Scanner sc=new Scanner(System.in);
	public Student getStudentData() {
		System.out.println("Enter Student Id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name:");
		String name=sc.nextLine();
		System.out.println("Enter Student Marks:");
		float marks=sc.nextFloat();
		System.out.println("Enter Student MobliNo:");
		long mobile=sc.nextLong();

		return new Student(id, name, marks, mobile);
	}
	public Student updateStudent() {
		System.out.println("Enter Student Id:");
		int id=sc.nextInt();
		System.out.println("Enter Student Marks:");
		float marks=sc.nextFloat();
		st.setId(id);
		st.setMarks(marks);
		return st;
	}
	public int getId() {
		System.out.println("Enter Student id:");
		return sc.nextInt();
	}
}
