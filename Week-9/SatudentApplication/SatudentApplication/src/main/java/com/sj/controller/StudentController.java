package com.sj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sj.component.StudentRequest;
import com.sj.component.StudentResponse;
import com.sj.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Welcome API
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Student App";
    }


    // Add Student
    @PostMapping(value = "/add", consumes = "application/json",produces = "application/json")
    public ResponseEntity<StudentResponse> addStudent(
            @RequestBody StudentRequest request) {

        return new ResponseEntity<>(
                service.addStudent(request),
                HttpStatus.CREATED
        );
    }


    // Get All Students
    @GetMapping(
        value = "/list",
        produces = "application/json"
    )
    public ResponseEntity<StudentResponse> getStudent() {

        return new ResponseEntity<>(
                service.getStudent(),
                HttpStatus.OK
        );
    }


    // Get Student By ID
    @GetMapping(
        value = "/getById/{id}",
        produces = "application/json"
    )
    public ResponseEntity<StudentResponse> getStudentById(
            @PathVariable int id) {

        return new ResponseEntity<>(service.getStudentById(id), HttpStatus.OK);
    }


    // Delete Student
    @DeleteMapping(value = "/delete/{id}", produces = "application/json" )
    public ResponseEntity<StudentResponse> removeById( @PathVariable int id) {
        return new ResponseEntity<>( service.removeById(id),HttpStatus.OK);
    }


    // Update Student
    @PutMapping(value = "/update/{id}",consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentResponse> updateStudent(@PathVariable int id,@RequestBody StudentRequest request) {

        return new ResponseEntity<>(service.updateStudent(id, request),HttpStatus.OK);
    }
}