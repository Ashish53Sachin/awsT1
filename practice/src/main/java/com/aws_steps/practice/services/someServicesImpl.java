package com.aws_steps.practice.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws_steps.practice.entities.student;
import com.aws_steps.practice.exceptions.StudentNotFoundException;
import com.aws_steps.practice.repo.studentRepo;


@Service
public class someServicesImpl implements someServices{

	private static final Logger logger = LoggerFactory.getLogger(someServicesImpl.class);

	@Autowired
	private studentRepo studentRep;

	@Override
	public List<student> getStudent() {
		// TODO Auto-generated method stub
		try {

			List<student> students = studentRep.findAll();
			if (students.isEmpty()) {
				throw new StudentNotFoundException("NO students found!!");
			}
			return students;
		}catch (StudentNotFoundException e) {
			logger.error("Error while Fetching Students data", e);
			throw new StudentNotFoundException("NO students found!!", e);

		} 
		
		catch (Exception e) {
			logger.error("Error while Fetching Students data", e);
			throw new RuntimeException("Error while Fetching Students data", e);

		}
	}

	@Override
	public student addStudent(student std) {
		// TODO Auto-generated method stub
		try {

			student students = studentRep.save(std);
			if (std == null) {
				throw new StudentNotFoundException("NO students found!!");
			}
			return students;
		} catch (Exception e) {
			logger.error("Error while adding Students data", e);
			throw new RuntimeException("Error while adding Students data", e);

		}
	}
	

	@Override
	public student deleteStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<student> getStudentById(int id) {
		// TODO Auto-generated method stub
		try {

			Optional<student> std = studentRep.findById(id);
			if (std.isPresent()) {
				return Optional.ofNullable(std.get());
			}
			return std;
		} catch (Exception e) {
			logger.error("Error while Fetching Students data", e);
			throw new RuntimeException("Error while Fetching Students data", e);

		}
	}

}
