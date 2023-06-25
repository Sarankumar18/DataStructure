package com.java.Queue;

public class MainList {

	public static void main(String[] args) {
		
		QueueList ql = new QueueList();
		//ql.display();
		ql.enqueue(0);
		ql.enqueue(2);
		ql.enqueue(3);
		ql.dequeue();
		ql.display();

	}

}
