package com.link;

public class Link<E>
{
	E data;
	Link<E> prev , next;
	
	public Link(E n)
	{
		data = n;
		next = null;
		prev = null;
	}
	
	public E getData()
	{
		return data;
	}
	
	public void setNext(Link<E> n)
	{
		next = n;
	}
	
	public void setPrev(Link<E> n)
	{
		prev = n;
	}
	
	public Link<E> getNext()
	{
		return next;
	}
	
	public Link<E> getPrev()
	{
		return prev;
	}
}
