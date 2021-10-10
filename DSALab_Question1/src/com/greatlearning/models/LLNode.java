package com.greatlearning.models;

public class LLNode {
	char data;
	LLNode next;
	
	public LLNode() {
		next = null;
	}
	
	public LLNode(char c) {
		data = c;
		next = null;
	}
}
