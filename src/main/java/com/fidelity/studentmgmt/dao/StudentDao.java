package com.fidelity.studentmgmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fidelity.studentmgmt.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

	@Query("Select s from Student s where s.courseId = :courseId")
	List<Student> findStudentByCourseId(int courseId);
	
}

