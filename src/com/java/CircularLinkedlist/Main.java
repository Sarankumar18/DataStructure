package com.java.CircularLinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Cll cl = new Cll();
			cl.insertFirst(10);
			cl.insertFirst(20);
			cl.insertLast(100);
			cl.insertFirst(30);
			cl.insert(0, 1);
			/*
			 * System.out.println(cl.deleteFirst()); System.out.println(cl.deleteFirst());
			 * System.out.println(cl.deleteLast());
			 */
			System.out.println(cl.delete(0));
			cl.display();
	}

}
