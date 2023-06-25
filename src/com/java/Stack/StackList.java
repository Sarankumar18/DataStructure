package com.java.Stack;

public class StackList {
	private Node top = null;
	
	//Push add the element at the top
	public void push(int value) {
		Node node = new Node(value);
		if(top == null) {
			node.next = null;
			top = node;
			return;
		}
		node.next = top;
		top = node;
	}
	
	//pop
	public int pop() {
		if(top == null) {
			System.out.println("Under Flow");
			return -1;
		}
		int value = top.value;
		top = top.next;
		return value;
	}
	
	//peek
	public int peek() {
		if(top == null) {
			System.out.println("Under Flow");
			return -1;
		}
		return top.value;
	}
	
	//display
	public void display() {
		if(top == null) {
			System.out.println("Under Flow");
			return;
		}
		Node temp = top;
		while(temp.next != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);
		return;
	}
	
	
	
	private class Node{
		Node next = null;
		int value ;
		
		public Node(int value) {
			this.value = value;
		}
		public Node(int value, Node next) {
			this.next = next;
		}
	}

}
