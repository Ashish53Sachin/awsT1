package com.aws_steps.practice.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws_steps.practice.entities.student;
import com.aws_steps.practice.services.someServices;



@RestController
public class awsControllers {

	private static final Logger logger = LoggerFactory.getLogger(awsControllers.class);

	@Autowired
	private someServices studentService;
	
	@PostMapping("/add")
	public ResponseEntity<student> addStudent(@RequestBody student std)
	{
		System.out.println(std.getAge());
		logger.info("Student information is: "+std.toString());
		studentService.addStudent(std);
		return ResponseEntity.ok(std) ;
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<student>> getStudent()
	{
		List<student> studentList = studentService.getStudent();
		logger.info("Student information is: "+studentList.toString());
	
		return ResponseEntity.ok(studentList) ;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<student>> getStudentbyId(@PathVariable int id)
	{
		Optional<student> studentList = studentService.getStudentById(id);
		logger.info("Student information is: "+studentList.toString());
		return ResponseEntity.ok(studentList);
	}


}

