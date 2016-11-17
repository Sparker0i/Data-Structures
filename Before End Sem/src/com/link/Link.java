package com.link;

public class Link {
	int data;
	Link next;
	
	public Link(int data) {
		this.data = data;
		this.next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(Link next) {
		this.next = next;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Link getNext() {
		return this.next;
	}
}
