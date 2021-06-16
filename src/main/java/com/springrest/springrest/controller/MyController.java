package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.courseentities.Courses;
import com.springrest.springrest.services.CourseServiceImplementation;


@RestController
// Controller class
public class MyController 
{	
	
	//Get the Home page message
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to sample courses spring boot Application";
	}
	
	//Get all the courses
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return objectOfCourseServiceImplementation().getCourses();
	}
	
	//Get only those courses based on courseID
	@GetMapping("/courses/{courseId}")
	public Courses getSingleCourseBasedOnCourseId(@PathVariable String courseId)
	{
		return objectOfCourseServiceImplementation().GetSingleCourse(Integer.parseInt(courseId));
	}
	
	//Add new courses
	@PostMapping("/courses")
	public Courses AddNewCourses(@RequestBody Courses course)
	{
		return objectOfCourseServiceImplementation().AddCourses(course);
	}
	
	//Update the courses
	@PutMapping("/courses")
	public Courses UpdateCourses(@RequestBody Courses course)
	{
		return objectOfCourseServiceImplementation().UpdateCourses(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Courses DeleteCourse(@PathVariable String courseId)
	{
		return objectOfCourseServiceImplementation().DeleteCourses(Integer.parseInt(courseId));
	}
	
	private CourseServiceImplementation objectOfCourseServiceImplementation()
	{
		CourseServiceImplementation courseServiceImpl=new CourseServiceImplementation();	
		return courseServiceImpl;
	}
	
}
