package com.link;

public class Link<E>
{
	E data;
	Link<E> next;
	
	public Link(E n)
	{
		data = n;
		next = null;
	}
	
	public E getData()
	{
		return data;
	}
	
	public void setNext(Link<E> n)
	{
		next = n;
	}
	
	public Link<E> getNext()
	{
		return next;
	}
}
