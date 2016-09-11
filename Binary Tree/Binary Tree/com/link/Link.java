package com.link;

public class Link
{
	int data;
	Link left , right;

	public Link(int n)
	{
		data = n;
		left = null;
		right = null;
	}

	public int getData()
	{
		return data;
	}

	public void setLeft(Link n)
	{
		left = n;
	}

	public Link getLeft()
	{
		return left;
	}

	public void setRight(Link n) {
		right = n;
	}

	public Link getRight() {
		return right;
	}
}
