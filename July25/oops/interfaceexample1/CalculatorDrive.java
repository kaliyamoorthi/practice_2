package com.oops.interfaceexample1;

import java.util.Scanner;

public class CalculatorDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculator calc=new Calculator();
		int result;
		//Menu Driven program
		System.out.println("Enter 1. Addition 2 Division");
		int choice=sc.nextInt();
		switch(choice){
			case 1 :result=calc.addition(a, b);
					System.out.println("sum="+result);
					break;
			case 2 : result=calc.division(a, b);
					 System.out.println("Q="+result);		
		}
		


	}

}
