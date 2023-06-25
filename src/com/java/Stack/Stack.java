package com.java.Stack;

public class Stack {
	int stack[] = new int[10];
	int size = stack.length;
	int top =-1 ;
	//push
	public void push(int value) {
		if(top >= size) {
			System.out.println("overFlow");
			return;
		}
		top++;
		stack[top] = value;
		
	}
	
	//pop
	public int pop() {
		if(top == -1) {
			System.out.println("Under Flow");
			return top;
		}
		int value = stack[top];
		top--;
		return value;
	}
	
	//display
	public void display() {
		if(top == -1) {
			System.out.println("Under Flow");
			return ;
		}	
		for(int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	//peek -- return the elemet of the top of the stack 
	
	public int peek() {
		if(top == -1) {
			System.out.println("under Flow");
			return -1;
		}
		return stack[top];
	}
	
	//contains the element
	public boolean contains(int element) {
		if(top == -1) {
			System.out.println("Underflow");
			return false;
		}
		
		for(int i = top; i >= 0; i--) {
			if(stack[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	
}
