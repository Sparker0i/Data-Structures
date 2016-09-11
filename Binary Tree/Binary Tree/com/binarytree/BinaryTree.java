package com.binarytree;

import com.link.*;

public class BinaryTree {
	Link root;
	
	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(Link root) {
		this.root = root;
	}
	
	public Link insert(Link node , int data) {
		if (node == null) {
			node = new Link(data);
		}
		else {
			if (data <= node.getData()) {
				node.setLeft(insert(node.getLeft() , data));
			}
			else {
				node.setRight(insert(node.getRight() , data));
			}
		}
		return node;
	}
	
	public void inorder(Link node) {
		if (node != null) {
			inorder(node.getLeft());
			System.out.print(node.getData());
			inorder(node.getRight());
		}
	}
	
	public void postorder(Link node) {
		if (node != null) {
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.getData());
		}
	}
	
	public void preorder(Link node) {
		if (node != null) {
			System.out.print(node.getData());
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
}
