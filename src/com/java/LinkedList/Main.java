package com.java.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LL ll = new LL();
		ll.insertFirst(1);
		ll.insertFirst(5);
		ll.insertFirst(6);
		ll.insertLast(20);
		ll.insertFirst(10);
		ll.insert(30, 2);
		System.out.println(ll.delete(7));
		System.out.println(ll.find(31));
		ll.display();

	}

}
