package com.java.universityapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.universityapp.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
	
	public StudentEntity findByRegistrationNumber(Long registrationNumber);
	
	public List<StudentEntity> findAllByStream(String stream);

}
