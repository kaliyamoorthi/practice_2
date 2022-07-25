package model;

public class Employee {
	private String firstname, lastname, department;
	
	//Constructor
	public Employee(String firstname, String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
		
	}
	//method which is used to set and read value- getter and setter
	//encapsulation- by implements getter and setter
	public String getDepartment(){
		return department;
	}
	
	public void setDepartment(String department){
		this.department=department;
	}
	
	
}
