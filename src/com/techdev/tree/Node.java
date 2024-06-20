package com.techdev.tree;

public class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}
	
	
	// 5 10 15 -> 8
	public void insert(int value) {
		if(value <= data) {
			if(left == null) {
				left = new Node(value);
			}else {
				left.insert(value);
			}
		}else {
			if(right == null) {
				right = new Node(value);
			}else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(data == value) {
			return true;
		}else {
			if(value < data) {
				if(left == null) {
					return false;
				}else {
					return left.contains(value);
				}
			}else {
				if(right == null) {
					return false;
				}else {
					return right.contains(value);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Node n1 = new Node(10);
		n1.left = new Node(5);
		n1.right = new Node(10);
		
		// insert
		n1.insert(8);
		
		// contains
		System.out.println(n1.contains(8));
	}
	
	
}
