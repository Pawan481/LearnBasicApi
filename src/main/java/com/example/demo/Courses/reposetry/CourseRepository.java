package com.example.demo.Courses.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Courses.bean.Course;

public interface CourseRepository extends JpaRepository< Course, Long> {
	

}
