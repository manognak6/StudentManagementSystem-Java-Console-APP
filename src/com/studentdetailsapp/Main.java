package com.studentdetailsapp;

public class Main {

	public static void main(String[] args) {
		System.out.println("**********Student Management System**********");
		System.out.println("**********Welcome****************************");
		Student s1;//s1 is a reference variable which stores unique identification hash code of the object stored in heap  whenever an object is created 3 things happen, those are 1. class is loaded into heap memory 2.instance variables are initialised 3constructor is called(if there are no parameters, default constructor is called.
		s1= new Student("Manogna",28,"S-564");
		s1.enrollCourse("Java");
		s1.printStudentInfo();
	//	Student s2= new Student("Leela", 24,"S-767");
	//	s2.printStudentInfo();
	//	s2.enrollCourse("C");
		Student s3= new Student("Mahesh",30,"S-7865");
		s3.enrollCourse("Angular");
		s3.enrollCourse(".Net Core");
		s3.printStudentInfo();

	}

}
