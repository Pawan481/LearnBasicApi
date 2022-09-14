package com.example.demo.Courses.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String author;
	
	public Course()
	{
		
	}
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		
		
	}
	@Override
	public String toString() {                                         // this is help us to see  the details we want to print on console
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
	
	
	

}
