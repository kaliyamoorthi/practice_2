package Collections;

import java.util.ArrayList;

class Employee{
	private int empid;
	private String name, department;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(int empid, String name, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
	}
	
	
}
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to store name
		ArrayList<String> list=new ArrayList<>();
		list.add("Monica");
		list.add("Rohan");
		System.out.println(list);
		
		//Store Employee's information
		
		ArrayList<Employee> elist=new ArrayList<>();
		elist.add(new Employee(101, "Sunil","Sales"));
		elist.add(new Employee(102, "Moni", "IT"));
		System.out.println(elist);
		for(Employee e :elist){
			System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getDepartment());
		}
	}

}
