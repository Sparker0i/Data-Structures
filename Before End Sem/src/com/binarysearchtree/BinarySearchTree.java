package com.binarysearchtree;

import com.mlink.*;

public class BinarySearchTree {
	
	public Link add(Link node, int n) {
		Link temp = new Link(n);
		if (node == null) {
			node = temp;
		}
		else if (n >= node.getData()) {
			node.setRight(add(node.getRight() , n));
		}
		else {
			node.setLeft(add(node.getLeft() , n));
		}
		return node;
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
	
	public Link getLowestFromRST(Link node) {
		if (node.getLeft() == null)
			return node;
		else {
			return getLowestFromRST(node.getLeft());
		}
	}
	
	public Link deleteNode(Link node , int data) {
		if (node==null) {
			return null;
		}
		if (data==node.getData()) {
			if (node.getLeft()!=null && node.getRight()!=null) {
			    Link minNode = getLowestFromRST(node.getRight());
			    node.setData(minNode.getData());
			 
			    node.setRight(deleteNode(node.getRight(), minNode.getData()));
			    System.out.println(minNode.getData());  
			}
			else if (node.getLeft() == null) {
				return node.getRight();
			}
			else {
				return node.getLeft();
			}
		}
		else if (data>node.getData()) {
		   node.setRight(deleteNode(node.getRight(), data));
		}
		else {
		   node.setLeft(deleteNode(node.getLeft(), data));
		}
		return node;
	}
}
