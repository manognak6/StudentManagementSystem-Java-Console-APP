package com.studentdetailsapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	private String name;
	private int age;
	private String studentId;
	private List<String> courses;
	
	public Student(String name, int age, String studentId)
	{
		super();
		if (validateAge(age) && validateId(studentId) && validateName(name)) 
		{
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		courses =  new ArrayList<String>();
		}
	}
		
	public void printStudentInfo() {
		System.out.println("***********Student Information*********");
		System.out.println("Student name " +name);
		System.out.println("Student age " +age);
		System.out.println("Student ID " +studentId);
		System.out.println("Courses enrolled for are " +courses);
	}
	//we we use toString() method to know the state/values of instance variables in the class
	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}
	
	//Validation methods to validate instance variables of Student class 
	public boolean validateAge(int age) 
	{
		if(age>=19 &&age<=35) 
		{
			return true;
		}
		else
		{
			System.err.println("Invalid Age. Student's age must be between 19 and 35");
			return false;
		}
	}
	public boolean validateId(String studentId) 
	{
		String studentRegex= "S-[0-9]+";
		Pattern idPattern=Pattern.compile(studentRegex);
	    Matcher idMatcher=idPattern.matcher(studentId);
	    if(idMatcher.matches())
	    {
	    	return true;
	    }
	    else 
	    {
	    	System.err.println("Invalid Student ID. Enter right ID using format S-[897]");
	    }
		return false;
	    
	}
	
	public boolean validateName(String name) 
	{
		String nameRegex="^[a-zA-Z\\s]+$";
		Pattern namePattern=Pattern.compile(nameRegex);
	    Matcher nameMatcher=namePattern.matcher(name);
	    if(nameMatcher.matches()) 
	    {
	    	return true;
	    }
	    else 
	    {
	    	System.err.println("Invalid name!! Please enter alphabets only");
	    }
		return false;
	
	}
	public void enrollCourse(String course) {
		if(this.validateCourseName(course))
		{
		if(!this.courses.contains(course) )
		{
			courses.add(course);
			System.out.println("Student is enrolled to " +course + " successfully");
		}
		else
		{
			System.err.println("Course is already added");
		}
		}
	}
	public boolean validateCourseName(String course)
	{
		if(course.equalsIgnoreCase("java") || course.equalsIgnoreCase("Angular") || course.equalsIgnoreCase(".Net Core") ||course.equalsIgnoreCase("Automation") || course.equalsIgnoreCase("Devops")
				|| course.equalsIgnoreCase("API Testing"))
		{
			return true;
		}
		else 
		{
			System.err.println("Invalid course!! Please enter the course that is in the list");
			return false;
			
		}
	}
	

}
