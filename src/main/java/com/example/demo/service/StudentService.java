package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;
	
	
	
	
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	
	
	
	public String saveStudent(Student student) {
		repo.save(student);
		return "data saved";
	}
	
	
	public List<Student> viewAllStudents(){
		return repo.findAll();
	}

}
