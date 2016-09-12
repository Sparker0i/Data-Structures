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
	
	public Link deleteNode(Link node, int data) {
		if (node==null) {
			return null;
		}
		if (data==node.getData()) {
			if (node.getLeft()!=null && node.getRight()!=null) {
			    Link minNode = getLowestFromRST(node.getRight());
			    node.setData(minNode);
			 
			    node.setRight(deleteNode(node.getRight(), minNode.getData()));
			    System.out.println(minNode);  
			}
			else if (node.getLeft()==null) {
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
		 
	public Link getLowestFromRST(Link node) {
		 if (node.getLeft()==null) {
			 return node;
		 }
		 else {
			 Link n = getLowestFromRST(node.getLeft());
			 return n;
		 }
	 }
}
