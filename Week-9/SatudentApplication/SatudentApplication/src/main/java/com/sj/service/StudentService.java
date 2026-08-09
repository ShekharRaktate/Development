package com.sj.service;

import java.util.List;
import java.util.Optional;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.component.StudentRequest;
import com.sj.component.StudentResponse;
import com.sj.entity.Student;
import com.sj.repository.StudentRepository;
import com.sj.util.Status;

@Service
public class StudentService {


	@Autowired
    private StudentRepository repo;




	
    public StudentResponse addStudent(StudentRequest request) {

        Student st = new Student();
        st.setName(request.name());
        st.setEmail(request.email());
        st.setAddress(request.address());
        st.setMobile(request.mobile());

        Student response = repo.save(st);

        if (response != null)
            return new StudentResponse(response, Status.SUCCESS);
        else
            return new StudentResponse(request, Status.FAIL);
    }

	public @Nullable StudentResponse getStudent() {
		// TODO Auto-generated method stub
		List<Student> students=repo.findAll();
		if(!students.isEmpty()) {
			return new StudentResponse(students,Status.SUCCESS);
		}
		return new StudentResponse(new RuntimeException("Record not present"),Status.FAIL);
	}
	public @Nullable Student getStudentById(int id) {
		Optional Student student=Optional.ofNullable(repo.findById(id).orElse(new Student ()));
		if(student!=null)
			return new Student(student,Status.SUCCESS);
		else {
			return new Student(student,Status.FAIL);
		}
	}
	public @Nullable StudentResponse removeById(int id) {
		Optional<Student>student=Optional.ofNullable(repo.findById(id).orElse(new Student ()));
		if(student!=null) {
			repo.deleteById(id);
			return new StudentResponse("record deleted successfuly",Status.SUCCESS);
		}
		else {
			return new StudentResponse("Student not Present",Status.FAIL);
		}
	}

	public Object updateStudent(int id, StudentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
}