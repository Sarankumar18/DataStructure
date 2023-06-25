package com.java.doublylinkedlist;

public class DLL {
	private Node head = null;
	private Node tail = null;
	private int size;
	
	public DLL() {
		this.size = 0;
	}
	
	//insertFirst Node
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.prev = null;
		node.next = head;
		if(head != null) {
			head.prev = node;
		}
		head = node;
		return ;
	}
	
	//insert Last
	public void insertLast(int value) {
		if(head == null) {
			insertFirst(value);
			return;
		}
		
		Node node = new Node(value);
		node.next = null;
		
		//To find the last node
		Node last = head;
		while(last.next != null)
			last = last.next;
		last.next = node;
		node.prev = last;
		return ;
	}
	
	//delete First
	
	public int deleteFirst() {
		if(head == null)
			return -1;
		int value = head.value;
		head = head.next;
		head.prev = null;
		return value;
	}
	
	//delete last
	public int deleteLast() {
		if(head == null)
			return -1;
		Node last = head;
		while(last.next != null)
			last = last.next;
		int value = last.value;
		last = last.prev;
		last.next = null;
		
		return value;
	}
	
	//delete at any index
	
	public int delete(int index) {
		if(index == 0) {
			int value = deleteFirst();
			return value;
		}
		Node temp = head;
		for(int i = 0 ; i < index; i++) {
			temp = temp.next;
		}
		if(temp.next != null) {
			temp.next.prev = temp.prev;
			
		}
		temp.prev.next = temp.next;
		int value = temp.value;
		return value;
	}
	
	//insert at the index
	
	public void insert(int value,int index) {
		if(head == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		Node temp = head;
		for(int i = 0 ; i < index; i++) {
			temp = temp.next;
		}
		System.out.println(temp.value);
		node.next = temp;
		node.prev = temp.prev;
		temp.prev = node;
		return ;
	}
	
	
	//Display all the elements
	
	public void display() {
		
		Node temp = head;	
		while(temp != null) {
			System.out.print(temp.value + " -> " );
			temp = temp.next;
		}
	}
	
	//Inner Class of Node
	private class Node{
		private int value ;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node prev, Node next) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		
	}

}
