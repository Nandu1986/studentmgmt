package com.fidelity.studentmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.studentmgmt.service.CourseService;
import com.fidelity.studentmgmt.service.StudentService;
import com.fidelity.studentmgmt.entity.Course;
import com.fidelity.studentmgmt.entity.Student;

@CrossOrigin(origins = "*")
@RequestMapping(path="/api")
@RestController
public class StudentController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private StudentService studentService;


	@GetMapping("/message")
	public String printMessage() {
		return "Welcome to Student management";
	}
	
	@GetMapping("/course")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@GetMapping("/student/{courseId}")
	public List<Student> getStudents(@PathVariable("courseId") Integer courseId ){
		return studentService.getStudents(courseId);
	}
	
}
