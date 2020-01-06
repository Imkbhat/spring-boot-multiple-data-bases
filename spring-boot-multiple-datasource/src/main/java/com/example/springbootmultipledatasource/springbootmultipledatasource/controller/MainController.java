package com.example.springbootmultipledatasource.springbootmultipledatasource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmultipledatasource.springbootmultipledatasource.entity.school.School;
import com.example.springbootmultipledatasource.springbootmultipledatasource.entity.student.Student;
import com.example.springbootmultipledatasource.springbootmultipledatasource.repository.school.SchoolRepository;
import com.example.springbootmultipledatasource.springbootmultipledatasource.repository.student.StudentRepository;

@RestController
public class MainController {
	
	@Autowired
	private SchoolRepository schoolRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@GetMapping(value="student")
	public ResponseEntity<List<Student>> getStudents() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentRepository.findAll());
	}
	
	@GetMapping(value="school")
	public ResponseEntity<List<School>> getSchool() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(schoolRepository.findAll());
	}
}
