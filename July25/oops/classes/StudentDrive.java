package com.oops.classes;

public class StudentDrive {

	public static void main(String[] args) {
		//Classname objectname=new classname();
		Student student1=new Student();
		student1.getInfo();
		String name=student1.getName(); // String is a class-- java.lang
		System.out.println("Student's name "+name);
		
		System.out.println("Student's name "+student1.getName());
		
		Student student2=new Student();
		student2.getInfo();
		name=student2.getName(); // String is a class-- java.lang
		System.out.println("Student's name "+name);
		
		System.out.println("Student's name "+student2.getName());
		
	}

}
