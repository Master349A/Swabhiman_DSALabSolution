package com.greatlearning.main;

import java.util.ArrayList;

class Node {
	
	int key;
	Node left, right;
	
	public Node() {
		left = null; right = null;
	}
	
	public Node(int key) {
		this.key = key;
		left = null; right = null;
	}
	
	
	public static ArrayList<Integer> findLongestPath(Node root) {
		if (root == null)
			return new ArrayList<Integer>();
		
		ArrayList<Integer> leftPath = findLongestPath(root.left);
		ArrayList<Integer> rightPath = findLongestPath(root.right);
		
		if (leftPath.size() >= rightPath.size()) {
			leftPath.add(root.key);
			return leftPath;
		}
		else {
			rightPath.add(root.key);
			return rightPath;
		}
	}
	
}


public class Driver {

	public static void main(String[] args) {
		Node node1 = new Node(100);
		Node node2 = new Node(20);
		Node node3 = new Node(130);
		Node node4 = new Node(10);
		Node node5 = new Node(50);
		Node node6 = new Node(110);
		Node node7 = new Node(140);
		Node node8 = new Node(5);
		
		node1.left = node2;
		node1.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		node4.left = node8;
		
		ArrayList<Integer> path = Node.findLongestPath(node1);
		System.out.println("Longest path : ");
		for (int i = path.size() - 1; i >= 0; i--) {
			System.out.print(path.get(i));
			if (i > 0)
				System.out.print(" -> ");
		}
	}

}
