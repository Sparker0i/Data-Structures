package com.mlink;

public class Link {
	int data;
	Link left;
	Link right;
	
	public Link(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setLeft(Link next) {
		this.left = next;
	}
	
	public void setRight(Link next) {
		this.right = next;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Link getLeft() {
		return this.left;
	}
	
	public Link getRight() {
		return this.right;
	}
}
