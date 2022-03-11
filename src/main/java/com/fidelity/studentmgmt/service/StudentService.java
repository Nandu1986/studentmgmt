package com.fidelity.studentmgmt.service;

import java.util.List;

import com.fidelity.studentmgmt.entity.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	
	public List<Student> getStudents(int courseId);

}
