package exceptionhandling;

import java.io.IOException;

public class Example4 {
	static void getInfo()throws ArithmeticException, ArrayIndexOutOfBoundsException{
		System.out.println(5/2);
		int arr[]={7};//arr[0]=7 arr[2]
		System.out.println(arr[2]);
		
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	try{	
	getInfo();
	System.out.println("Main Try");
	}
	catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
	}
		System.out.println("Hello All!!!");
}

}
