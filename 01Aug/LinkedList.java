package DataStructure;

import java.io.*;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static LinkedList insert(LinkedList list, int data) {

		// Create a new node with given data
		Node new_node = new Node(data);
		//If head is null - insert first node
		if (list.head == null) {
			list.head = new_node;
		}
		else
		{
			Node last;
			//to move pointer to last node to insert new node
			for(last=list.head;last.next!=null;last=last.next){}
			last.next=new_node;
		}
		return list;
	}
		
	
	public static LinkedList deleteByKey(LinkedList list, int key) {
		
		Node currnode=list.head, prev=null;
		//Delete First Node
		if(currnode!=null && currnode.data==key){
			list.head=currnode.next;
			System.out.println( " found and deleted"+key);
		}
		else{
		while (currnode != null && currnode.data != key) {
			prev = currnode;
			currnode = currnode.next;
		}
		
		
		if (currnode != null) {
			prev.next = currnode.next;
			System.out.println( " found and deleted"+key );
		}
		if(currnode==null)
			System.out.println("Key not found"+key);
		
		}
		return list;
	}
	
	
	
	
	
		public static void print(LinkedList list){
			
			for(Node last=list.head;last!=null;last=last.next){
				
				System.out.print(last.data+" ");
				
			}
			System.out.println();
		}
		
		
		
	public static void main(String[] args) {
		/*
		 * Node one=new Node(23); head=one;
		 * System.out.println("data-->"+one.data);
		 * System.out.println("next value-->"+one.next);
		 * System.out.println("head-->"+head);
		 * 
		 * Node two=new Node(12); one.next=two;
		 * System.out.println("next value-->"+one.next);
		 */

		LinkedList list = new LinkedList();
		list=insert(list, 23);
		list=insert(list, 12);
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		print(list);
		list=deleteByKey(list,23);
		list=deleteByKey(list,8);
		print(list);
	}
}
