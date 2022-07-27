package Collections;

import java.util.ArrayList;

class Person{
	private int age;
	private String name;
	public Person(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class InstanceExample {

	public static void main(String[] args) {
		
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person(23,"Neha"));
		list.add(new Person(24,"Leena"));
		System.out.println(list);
		
		for(Person person : list ){
				System.out.println(person.getName()+"\t"+person.getAge());
		}
		
		
	}

}
/* for(Class obj : Collectionname ){

}*/