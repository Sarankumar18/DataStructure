package com.java.LinkedList;


/*Operation in Singly linked list
  
 * */

public class LL {
	private Node head;
	private Node tail;
	private int size;
	public LL() {
		this.size = 0;
	}
	
	//insert First element
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size++;
	}
	//insertLast Element
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
		
		/*System.out.println(tail.next);
		System.out.println(tail);
		System.out.println(node);*/
	}
	
	//insert at the index
	
	public void insert(int val, int index) {
		//if index = 0 , then calling the insert First method to insert the element
		if(index == 0) {
			insertFirst(val);
			return ;
		}
		// if index == size, then calling the last insert method to insert at the end
		if(index == size) {
			insertLast(val);
			return;
		}
		
		//if index is not equal size and the 0, then creating temp node to reach the location and insert he value
		Node temp = head;
		for(int i = 0 ; i < index-1; i++)
			temp = temp.next;
		//Now we have reached the inserting location previous node
		Node node = new Node(val);
		node.next = temp.next;
		temp.next = node;
		size++;
		
	}
	
	//delete First
	public int deleteFirst() {
		
		int value = head.value;
		head = head.next;
		if(head == null)
			tail = null;
		size--;
		return value;
		
	}
	
	//delete Last element
	public int deleteLast() {
		Node secondLast = get(size -2);
		int value = tail.value;
		tail = 	secondLast;
		tail.next = null;
		size--;
		return value;
	}
	
	//delete at any position
	public int delete(int index) {
		if(index >= size) {
			System.out.println("Index is out of size.");
			return -1;
		}
		int value;
		if(index == 0)
			value = deleteFirst();
		if(index == size - 1)
			value = deleteLast();
		
		Node prev = get(index - 1);
		value = prev.next.value;
		prev.next = prev.next.next;
		size--;
		return value;
	}
	
	//Find the element in the array list, return the position if element found else -1
	public int find(int value) {
		int pos = -1;
		Node temp = head;
		for(int i = 0 ; i < size; i++) {
			if(temp.value == value) {
				return i;
			}
			temp = temp.next;
		}
		return pos;
	}
	
	//get method to get the node by passing the location
	
	public Node get(int index) {
		Node node = head;
		for(int i = 0 ; i < index; i++) {
			node = node.next;	
		}
		
		return node;
	}
	
	//Display elements
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value  = value;
			this.next = next;
		}
		
	}

}
