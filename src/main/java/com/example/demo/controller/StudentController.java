package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	 private StudentService service;

	 @PostMapping("/save")
	 public ResponseEntity<String> saveStudent(@RequestBody Student student ){
		 String status=service.saveStudent(student);
		 return new ResponseEntity<>(status,HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/get")
	 public ResponseEntity<List<Student>> viewAll(){
		 List<Student> list= service.viewAllStudents();
		 return new ResponseEntity<>(list,HttpStatus.OK);
	 }
	 
	 @DeleteMapping("/del/{id}")
	 public String getStudent(@PathVariable int id) {
		 service.delete(id);
			    
		return "deleted successfully";
	 
	 }

}