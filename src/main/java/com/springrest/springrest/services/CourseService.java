package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.courseentities.Courses;


//Interface of CourseService
public interface CourseService
{
	 List<Courses> getCourses();
	 Courses GetSingleCourse(int courseID);
	 Courses AddCourses(Courses course);
	 Courses UpdateCourses(Courses course);
	 Courses DeleteCourses(int course);

}
