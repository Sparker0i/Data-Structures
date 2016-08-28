package com.circularlinkedlist;

import com.link.*;

public class CircularLL<E> 
{
	Link<E> front , rear;
	int count;
	
	public CircularLL() 
	{
		rear = null;
		front = null;
		count = 0;
	}
	
	public boolean isEmpty() 
	{
		return (count == 0);
	}
	
	public void display() 
	{
		Link<E> tmp = front;
		while(tmp != rear) 
		{
			System.out.print(tmp.getData() + " ");
			tmp=tmp.getNext();
		}
		if(rear!=null)
			System.out.println(rear.getData());
	}
	
	public void insertFront(E e) 
	{
		Link<E> nptr = new Link<E>(e);
		if(isEmpty()) 
		{
			front=nptr;
			rear=front;
		}
		else 
		{
			nptr.setNext(front);
			front=nptr;
			rear.setNext(front);
		}
		count++;
	}
	
	public void insertBack(E e) 
	{
		Link <E> nptr = new Link<E>(e);
		if(isEmpty()) 
		{
			front=nptr;
			rear=front;
		}
		else {
			rear.setNext(nptr);
			rear=rear.getNext();
			rear.setNext(front);
		}
		count++;
	}
	
	public void insertAt(E e,int p) 
	{
		Link<E> nptr = new Link<E>(e);
		if(p==1) 
		{
			insertFront(e);
			return;
		}
		else if(isEmpty()) 
		{
			System.out.println("Cannot insert");
			return;
		}
		else 
		{
			Link<E> tmp=front;
			int x=1;
			while(tmp.getNext() != front) 
			{
				if(x == (p-1))
					break;
				x++;
				tmp=tmp.getNext();
			}
			if(x == (p-1)) 
			{
				nptr.setNext(tmp.getNext());
				tmp.setNext(nptr);
				if(rear == tmp)
					rear=nptr;
				count++;
			}
			else 
			{
				System.out.println("Cannot insert");
			}
		}
	}
	
	public void deleteFront() 
	{
		if(isEmpty()) 
		{
			System.out.println("Cannot remove");
			return;
		}
		else 
		{
			if(front==front.getNext()) 
			{
				front=rear=null;
				count--;
			}
			else 
			{
				front=front.getNext();
				rear.setNext(front);
				count--;
			}
		}
	}
	
	public void deleteAt(int p) 
	{
		Link<E> tmp;
		if(isEmpty()) 
		{
			System.out.println("Cannot remove");
			return;
		}
		else if(p == 1) 
		{
			deleteFront();
		}
		else if(p > count)
		{
			System.out.println("Cannot remove");
			return;
		}	
		else 
		{
			int x = 1;
			tmp = front;
			while(tmp.getNext() != front) 
			{
				if(x == (p-1)) 
				{
					break;
				}
				tmp=tmp.getNext();
				x++;
			}
			if(x == (p-1)) 
			{
				if(front==front.getNext()) 
				{
					front=rear=null;
					count--;
				}
				else 
				{
					tmp.setNext(tmp.getNext().getNext());
					if(tmp.getNext()==front)
						rear=tmp;
					count--;
				}	
			}
			else 
			{
				System.out.println("Cannot remove");
			}
		}
	}
	
	public int getSize() 
	{
		return count;
	}
}
