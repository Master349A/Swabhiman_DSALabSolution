package com.greatlearning.services;

import com.greatlearning.models.Stack;

public class BalanceChecker {
	Stack mstack;
	
	public BalanceChecker() {
		mstack = new Stack();
	}
	
	public boolean isBalancedBracket(String text) {
		if (text.length() % 2 != 0)		//if number of brackets is odd, then it is not posssible to be balanced
			return false;
		
		for (char c : text.toCharArray()) {
			if (c == '(' || c == '{' || c == '[')
				mstack.push(c);
			else if (c == ')' && !mstack.isEmpty() && mstack.pop() != '(')
				return false;
			else if (c == '}' && !mstack.isEmpty() && mstack.pop() != '{')
				return false;
			else if (c == ']' && !mstack.isEmpty() && mstack.pop() != '[')
				return false;
			//else 
				//throw new Exception("Invalid input character...");
		
		}
		
		if (!mstack.isEmpty())
			return false;
		
		return true;
	}
}
