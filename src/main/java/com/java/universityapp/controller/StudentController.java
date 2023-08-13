package com.java.universityapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.universityapp.entity.StudentEntity;
import com.java.universityapp.service.StudentService;

@RestController
@RequestMapping(value = "/studentController")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/saveStudent")
	public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity) {
		return studentService.saveStudent(studentEntity);
	}
	
	@PostMapping(value = "/saveStudents")
	public List<StudentEntity> saveStudents(@RequestBody List<StudentEntity> studentEntitys) {
		return studentService.saveStudents(studentEntitys);
	}
	
	@GetMapping(value = "/findAll")
	public List<StudentEntity> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping(value = "/findByRegistrationNumber")
	public StudentEntity getByRegistrationNumber(@RequestParam Long registrationNumber) {
		return studentService.getByRegistrationNumber(registrationNumber);
	}
	
	@GetMapping(value = "/findAllByStream")
	public List<StudentEntity> getAllByStream(@RequestParam String stream){
		return studentService.getAllByStream(stream);
	}
	

}
