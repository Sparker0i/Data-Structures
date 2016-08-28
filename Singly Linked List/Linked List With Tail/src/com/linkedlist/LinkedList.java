package com.linkedlist;

import com.link.*;

public class LinkedList<E> 
{
	Link<E> head , tail;
	int size;
	
	LinkedList()
	{
		head = null;
		size = 0;
	}
	
	public void addFirst(E e)
	{
		Link<E> nptr = new Link<E>(e);
		if (isEmpty())
		{
			head = nptr;
			head.setNext(null);
			tail = head;
		}
		else
		{
			head = nptr;
			head.setNext(null);
		}
		++size;
	}
	
	public void addLast(E e)
	{
		Link<E> nptr = new Link<E>(e);
		if (isEmpty())
		{
			head = nptr;
			head.setNext(null);
			tail = head;
		}
		else
		{
			tail = nptr;
			tail.setNext(null);
		}
	}
	
	public E removeFirst()
	{
		if (isEmpty())
			return null;
		else
		{
			E e = head.getData();
			head = head.getNext();
			--size;
			if (size == 0)
				tail = null;
			return e;
		}
	}
	
	public E First()
	{
		if (isEmpty())		return null;
		return head.getData();
	}
	
	public E Last()
	{
		if (isEmpty())		return null;
		else
		{
			Link<E> curr = head;
			while (curr.getNext() != null)
			{
				curr = curr.getNext();
			}
			return curr.getData();
		}
	}
	
	public E removeLast()
	{
		if (head == null)
			return null;
		else 
		{
			Link<E> curr = head;
			while (curr.getNext() != tail)
			{
				curr = curr.getNext();
			}
			E data = tail.getData();
			tail = curr;
			tail.setNext(null);
			return data;
		}
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
}
