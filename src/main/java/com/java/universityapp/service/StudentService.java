package com.java.universityapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.universityapp.entity.StudentEntity;
import com.java.universityapp.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public StudentEntity saveStudent(StudentEntity studentEntity) {
		StudentEntity savedStudent = studentRepository.save(studentEntity);
		return savedStudent;
	}

	public List<StudentEntity> saveStudents(List<StudentEntity> studentEntitys) {
		List<StudentEntity> savedStudents = studentRepository.saveAll(studentEntitys);
		return savedStudents;
	}

	public List<StudentEntity> getAllStudents() {
		return studentRepository.findAll();
	}

	public StudentEntity getByRegistrationNumber(Long registrationNumber) {
		StudentEntity dbStudent = studentRepository.findByRegistrationNumber(registrationNumber);
		return dbStudent;
	}
	
	
	
	
	
}
