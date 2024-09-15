package com.aws_steps.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws_steps.practice.entities.student;



@Repository
public interface studentRepo extends JpaRepository<student, Integer>{

}
