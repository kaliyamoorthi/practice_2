package Arrays;

import java.util.Scanner;

class Person {
	private String name;

	public Person(String name) {
		
		this.name = name;
	}

	public void display() {
		System.out.println("name:" + name);
	}
}

public class ArrayExample5 {
	public static void main(String[] args) {
//			Person p1=new Person("Kavita");
//			Person p2=new Person("Monica");
//			Person p3=new Person("Reena");
			Person obj[]=new Person[3];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<obj.length;i++){
				
				obj[i]=new Person(sc.next());
				
			}
			
			//display all values in Array of Objects
			for(int i=0;i<obj.length;i++)
			obj[i].display();
			
			
			
			
	}
}
