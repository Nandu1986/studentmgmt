package com.fidelity.studentmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fidelity.studentmgmt.dao.StudentDao;
import com.fidelity.studentmgmt.entity.Student;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	private  StudentDao studentDao;
	
	
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}
	
	public List<Student> getStudents(int courseId) {		
		return studentDao.findStudentByCourseId(courseId);
	}


}
