package com.java.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL dl = new DLL();
		dl.insertLast(20);
		dl.insertFirst(0);
		dl.insertFirst(10);
	//	System.out.println(dl.deleteFirst());
		dl.insertFirst(30);
		//System.out.println(dl.deleteLast());
		
		dl.insert(50, 1);
		dl.display();
	}

}
