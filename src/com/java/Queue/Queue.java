package com.java.Queue;

public class Queue {
	int queue[] = new int[10];
	int qsize = queue.length;
	int front = -1;
	int rear = -1;
	
	//insert an element at the queue
	public void enqueue(int value) {
		//if queue empty
		if(qsize == rear+1) {
			System.out.println("Over Flow");
			return;
		}
		if(front == -1 && rear == -1) {
			front = 0;
			rear = 0;
		} 
		else {
			rear++;
		}
		queue[rear] = value;
		return;
		}
	//delete (dequeue) from the queue
	public int dequeue() {
		if(front == -1 || front > rear) {
			System.out.println("Under Flow");
			return -1;
		} 
		else {
			int value = queue[front];
			if(front == rear) {
				front = rear = -1;
			}else {
				front++;
			}
			return value;
		}	
		
	}
	
	//display
	public void display() {
		if(front==-1 || front > rear) {
			System.out.println("Under Flow");
			return;
		}
		else {
			for(int i = front; i <= rear; i++) {
				System.out.println(queue[i]);
			}
			return;
		}
	}
}
