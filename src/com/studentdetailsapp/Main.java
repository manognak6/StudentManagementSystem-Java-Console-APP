package com.studentdetailsapp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("**********Student Management System**********");
		System.out.println("**********Welcome****************************");
		//S1 IS A REFERENCE VARIABLE WHICH STORES UNIQUE IDENTIFICATION HASH CODE OF THE OBJECT STORED IN HEAP  WHENEVER AN OBJECT IS CREATED 3 THINGS HAPPEN, THOSE ARE 1. CLASS IS LOADED INTO HEAP MEMORY 2.INSTANCE VARIABLES ARE INITIALISED 3CONSTRUCTOR IS CALLED(IF THERE ARE NO PARAMETERS, DEFAULT CONSTRUCTOR IS CALLED.
		
		List<Student> studentlist=new ArrayList<Student>();
		Student s1 =new Student("manogna",28,"S-56");
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Student name");
		String name=scanner.next();
		System.out.println("You entered name "+name);
		
		System.out.println("Enter student age");
		int age=scanner.nextInt();
		System.out.println("Student age you entered is "+age);
		
		System.out.println("Enter student ID");
		String studentId=scanner.next();
		System.out.println("Student ID you entered is "+studentId);
		
		System.out.println("Student Id is " +studentId);
		Student result = findStudentById("S-56");
		System.out.println("Result is "+result);
	}		
	
		public static Student findStudentById(String studentId) {
			Student result = null;
			try {
				result = studentlist.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId)).findFirst()
						.orElseThrow(() -> new RuntimeException("No Data found"));

		}
			catch (RuntimeException e) {
				System.err.println("Student with ID "+studentId +" not found");
			}
			return result;
	}}
