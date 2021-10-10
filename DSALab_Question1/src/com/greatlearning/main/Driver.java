package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.services.BalanceChecker;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the string to check: ");
		String text = in.next();
		boolean isBalanced;
		
		BalanceChecker balChecker = new BalanceChecker();
		
		isBalanced = balChecker.isBalancedBracket(text);
		if (isBalanced)
			System.out.println("The entered String has Balanced Brackets.");
		else
			System.out.println("The entered String does not contain Balanced Brackets.");
			
		
		in.close();
	}

}
