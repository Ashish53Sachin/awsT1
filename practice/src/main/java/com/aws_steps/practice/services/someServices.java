package com.aws_steps.practice.services;

import java.util.List;
import java.util.Optional;

import com.aws_steps.practice.entities.student;



public interface someServices {
	
	public List<student> getStudent();
	public student addStudent(student std);
	public Optional<student> getStudentById(int id);
	public student deleteStudent(int id);

}
