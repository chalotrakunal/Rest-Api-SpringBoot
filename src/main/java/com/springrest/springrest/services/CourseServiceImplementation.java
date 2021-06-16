package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.courseentities.Courses;


//class implementing interface and its methods
public class CourseServiceImplementation implements CourseService
{
	Courses courses;	
	List<Courses> list;
	
	public CourseServiceImplementation() 
	{
		list= new ArrayList<Courses>();
		list.add(new Courses(123,"c#","this is C# subject"));
		list.add(new Courses(145,"Java","This is Java Subject"));
		list.add(new Courses(458,"Python","This is Python Course"));
	}

	@Override
	public List<Courses> getCourses() 
	{	
    	return list;	
	}
	
	@Override
	public Courses GetSingleCourse(int courseID)
	{
		//Courses courses1 = null;
		for(Courses course: list)
		{
			if(course.getId()==courseID)
			{
				courses = course;
				break;
			}
		}
		return courses;
	}

	@Override
	public Courses AddCourses(Courses course) 
	{
		list.add(course);
		return course;
	}

	@Override
	public Courses UpdateCourses(Courses course)
	{
		for(Courses courses : list)
		{
			if(courses.getId()== course.getId())
			{
				courses.setTitle("Ruby");
				courses.setDescription("This is Ruby Subject");
			}
		}
		return courses;
	}

	@Override
	public Courses DeleteCourses(int courseId)
	{
		for(Courses courses: list)
		{
			if(courses.getId()==courseId)
			{
				list.remove(courses);
				break;
			}
		}
		return courses;
	}
}
