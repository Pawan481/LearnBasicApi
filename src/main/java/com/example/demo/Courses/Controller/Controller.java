package com.example.demo.Courses.Controller;


import java.util.Arrays;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Courses.bean.Course;
import com.example.demo.Courses.reposetry.CourseRepository;


@RestController
public class Controller {
	
	@Autowired
	private CourseRepository repository;
	
	@GetMapping("/Courses")
	public List<Course> getAllCourses(){
		
		//return repository.findAll();
		
		
		
     return Arrays.asList(new Course( 1 ," MicroServices", "in28Minites"),
			             new Course (2, "Spring" , "SpringBoot" ));
		
	}
		
		@GetMapping("/Courses/1")
		public  Course getAllCoursesTwo(){
			
			return new Course( 1 ," MicroServices 22", "in28Minites");
	}
	
	

}
