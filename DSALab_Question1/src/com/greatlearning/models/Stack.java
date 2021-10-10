package com.greatlearning.models;

public class Stack {

	LLNode stackTop;
	int size, capacity;
	
	public Stack() {
		capacity = 100;
		size = 0;
		stackTop = null;
	}
	
	public Stack(int cap) {
		capacity = cap;
		size = 0;
		stackTop = null;
	}
	
	public boolean isEmpty() {
		return stackTop == null;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public void push(char c) {
		if (isFull()) {
			//System.out.println("Stack overflow!");
			return;
		}
		
		LLNode newNode = new LLNode(c);
		newNode.next = stackTop;
		stackTop = newNode;
		size++;	
	}
	
	public char pop() {
		if (isEmpty()) {
			//System.out.println("Stack is empty!");
			return '0';
		}
		
		char popedChar = stackTop.data;
		stackTop = stackTop.next;
		size--;
		
		return popedChar;
	}
}
