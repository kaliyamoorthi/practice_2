import java.util.Scanner;

import service.CredentialServices;
import service.CredentialServicesImpl;
import model.Employee;


public class Driveclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String firstname=sc.next();
		System.out.println("Enter last name");
		String lastname=sc.next();
		System.out.println("Enter department(Techn, Admin, HR, Legal)");
		String department=sc.next();
		
		Employee emp=new Employee(firstname,lastname);
		emp.setDepartment(department);
		
		CredentialServicesImpl obj=new CredentialServicesImpl();
		obj.showCredentials(firstname, lastname, department);
		

	}

}
