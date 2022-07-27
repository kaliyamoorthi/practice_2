package Collections;

import java.util.ArrayList;

public class CollectionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//older way of collections without generics
	/*	ArrayList list=new ArrayList();
		list.add("Sunita");
		list.add(89);
		System.out.println(list);
		int ans=(int)list.get(1)+10;
		System.out.println(list.get(0));
		System.out.println(ans);*/
		//generic class
		ArrayList<String>alist =new ArrayList<>();
		alist.add("Kavita");
		//alist.add(89);
		
		ArrayList<Integer> alist1=new ArrayList<>();
		alist1.add(89);
		//alist1.add("Kavita");
		int sol=alist1.get(0)+10;

	}

}
