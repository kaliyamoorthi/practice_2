package com.oops.classes;
import java.util.Scanner;
public class Student {
	//instance variables- variables which are copied in objects
	private int rollno;
	private String name;
	private float total;
	
	public void getInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		rollno=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter total");
		total=sc.nextFloat();
	}
	public String getName(){
		return this.name;
	}
	
}
