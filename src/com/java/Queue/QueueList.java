package com.java.Queue;

public class QueueList {
	Node front = null;
	Node rear = null;
	
	//Enqeue
	public void enqueue(int value) {
		Node node = new Node(value);
		if(front == null && rear == null) {
			front = node;
			rear = node;
			rear.next = null;
		}
		else {
			rear.next = node;
			rear = node;
			node.next = null;
		}
	}
	
	//Enqueue
	public int dequeue() {
		if(front== null) {
			System.out.println("Under Flow");
			return -1;
		}
		int value = front.value;
		front = front.next;
		return value;
	}
	
	
	//display
	
	public void display() {
		if(front == null && rear == null) {
			System.out.println("Under Flow");
			return;
		}
		else {
			Node temp = front;
			while(temp.next != null) {
				System.out.println(temp.value);
				temp  = temp.next;
			}
			System.out.println(temp.value);
			return;
		}
	}
	
	
	
	private class Node{
		int value;
		Node next = null;
		public Node(int value) {
			this.value = value;
		}
		
	}

}
