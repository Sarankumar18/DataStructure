package com.java.CircularLinkedlist;

public class Cll {
	public Node head = null;
	
	//Insert Beginnning
	public void insertFirst(int value) {
		
		Node node = new Node(value);
		
		if(head == null) {
			head = node;
			head.next = node;
			return ;
		}
		//Find last node which pointing head, 
		Node temp  = head ;
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = node;
		node.next = head;
		head = node;
		return;
	}
	
	//Insert Last
	public void insertLast(int value) {
		Node node = new Node(value);
		if(head == null) {
			insertFirst(value);
			return;
		}
		Node last  = head ;
		while(last.next != head) {
			last = last.next;
		}
		last.next = node;
		node.next = head;
		return;
	}
	
	//Insert at index
	public void insert(int value, int index) {
		Node node = new Node(value);
		if(head == null) {
			insertFirst(value);
			return;
		}
		Node prev_node = head;
		for(int i = 1 ; i < index ; i++) {
			prev_node = prev_node.next;
		}
		node.next = prev_node.next ;
		prev_node.next = node;
		return;
	}
	
	//.deleteFirst
	public int deleteFirst() {
		if(head == null) {
			System.out.println("No Elements  in the list to delete");
			return -1;
		}
		if(head.next == head) {
			head =null;
			return -1;
		}
		int value = head.value;
		Node last  = head ;
		while(last.next != head) {
			last = last.next;
		}
		last.next = head.next;
		head = head.next;
		return value;
	}
	//delete last
	public int deleteLast() {
		//If No elements
		if(head == null){
			System.out.println("Under Flow");
			return -1;
		}
		if(head == head.next) {
			head = null;
		}
		Node last  = head ;
		Node last_prev = head;
		while(last.next != head) {
			last_prev = last;
			last = last.next;
		}
		int value = last.value;
		last_prev.next = head;
		return value;
	}
	
	//delete at the index
	public int delete(int index) {
		if(head == null){
			System.out.println("Under Flow");
			return -1;
		}
		if(head == head.next) {
			head = null;
			return -1;
		}
		Node last  = head ;
		Node last_prev = head;
		for(int i = 0 ; i< index; i++) {
			last_prev = last;
			last = last.next;
		}
		int value = last.value;
		last_prev.next  = last.next;
		return value;
	}
	
	//Display
	
	public void display() {
		
		Node temp = head;
		if(head == null) {
			System.out.println("No Elements");
			return;
		}
		while(temp.next != head) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.value);
		return;
	}
	
	
	
	
	//Skeleton
	
	private class Node{
		private Node next;
		private int value;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

}
