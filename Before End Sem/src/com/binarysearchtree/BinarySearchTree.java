package com.binarysearchtree;

import com.mlink.*;

public class BinarySearchTree {
	Link root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public Link add(Link node, int n) {
		Link temp = new Link(n);
		if (root == null) {
			root = temp;
		}
		else if (n >= root.getData()) {
			root.setRight(add(node.getRight() , n));
		}
		else {
			root.setLeft(add(node.getLeft() , n));
		}
		return root;
	}
	
	public void preorder(Link node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	
	public void postorder(Link node) {
		if (node != null) {
			preorder(node.getLeft());
			preorder(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}
	
	public void inorder(Link node) {
		if (node != null) {
			preorder(node.getLeft());
			System.out.print(node.getData() + " ");
			preorder(node.getRight());
		}
	}
}
