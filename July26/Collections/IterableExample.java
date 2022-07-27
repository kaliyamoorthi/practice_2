package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Manish");
		list.add("Kavish");
		list.add("Manoj");
		list.add("Kanika");
		
		Iterator<String> names=list.iterator();
		
		while(names.hasNext()){
			System.out.println(names.next());
		}
		

	}

}
