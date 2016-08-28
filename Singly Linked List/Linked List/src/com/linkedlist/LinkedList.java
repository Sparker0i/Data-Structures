package com.linkedlist;

import com.link.*;

public class LinkedList<E> 
{
	Link<E> head;
	int size;
	
	LinkedList()
	{
		head = null;
		size = 0;
	}
	
	public void addFirst(E e)
	{
		Link<E> nptr = new Link<E>(e);
		if (head == null)
		{
			head = nptr;
			head.setNext(null);
		}
		else
		{
			Link<E> temp = head;
			head = nptr;
			head.setNext(temp);
		}
		++size;
	}
	
	public void addLast(E e)
	{
		Link<E> nptr = new Link<E>(e) , curr = head;
		while (curr.getNext() != null)
		{
			curr = curr.getNext();
		}
		curr.setNext(nptr);
		++size;
	}
	
	public E removeFirst()
	{
		if (head == null)
			return null;
		else
		{
			Link<E> temp = head;
			head = head.getNext();
			--size;
			return temp.getData();
		}
	}
	
	public E First()
	{
		return head.getData();
	}
	
	public E Last()
	{
		Link<E> curr = head;
		while (curr.getNext() != null)
		{
			curr = curr.getNext();
		}
		return curr.getData();
	}
	
	public E removeLast()
	{
		if (head == null)
			return null;
		else 
		{
			Link<E> curr = head;
			while (curr.getNext().getNext() != null)
			{
				curr = curr.getNext();
			}
			E data = curr.getNext().getData();
			curr.setNext(null);
			return data;
		}
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
}
