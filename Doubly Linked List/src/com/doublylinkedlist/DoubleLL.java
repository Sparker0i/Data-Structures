package com.doublylinkedlist;

import com.link.Link;

public class DoubleLL<E>
{
	Link<E> head , tail;
	int size;
	
	public DoubleLL()
	{
		size = 0;
		head = null;
		tail = null;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	public E First()
	{
		if (isEmpty())		return null;
		return head.getNext().getData();
	}
	
	public E Last()
	{
		if (isEmpty())		return null;
		return tail.getPrev().getData();
	}
	
	public void addFirst(E e)
	{
		Link<E> nptr = new Link<E>(e);
		head.setNext(nptr);
		head.getNext().setPrev(nptr);
		++size;
	}
	
	public void addLast(E e)
	{
		Link<E> nptr = new Link<E>(e);
		tail.getPrev().setNext(nptr);
		tail.setPrev(nptr);
		++size;
	}
	
	public E remove(Link<E> link)
	{
		Link<E> pre = link.getPrev() , next = link.getNext();
		pre.setNext(next);
		next.setPrev(pre);
		size--;
		return link.getData();
	}
}
