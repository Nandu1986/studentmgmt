package com.fidelity.studentmgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fidelity.studentmgmt.entity.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {

}
