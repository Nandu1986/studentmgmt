package com.fidelity.studentmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fidelity.studentmgmt.dao.CourseDao;
import com.fidelity.studentmgmt.entity.Course;

@Component
public class CourseServiceImpl implements CourseService {

	@Autowired
	private  CourseDao courseDao;
	

	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

}
