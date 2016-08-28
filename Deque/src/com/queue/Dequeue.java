package com.queue;

import com.link.*;

public class Dequeue<E>
{
  private Link<E> front , rear;
  int count;

  public Dequeue()
  {
    front = null;
    rear = null;
  }

  public int getNum()
  {
    return count;
  }

  public void addFirst(E e)
  {
	  Link<E> node = new Link<E>(e);
	  if (isEmpty())
	  {
		  front = node;
		  rear = node;
	  }
	  else
	  {
		  Link<E> temp = front;
		  front = node;
		  front.setNext(temp);
	  }
	  ++count;
  }
  
  public void addLast(E e)
  {
	  Link<E> node = new Link<E>(e);
	  if (isEmpty())
	  {
		  front = node;
		  rear = node;
	  }
	  else
	  {
		  rear.setNext(node);
		  rear = node;
	  }
	  ++count;
  }
  
  public E removeFirst()
  {
	if (front == null)
		  return null;
	else if (front.getNext() == null)
    {
    	E data = front.getData();
    	front = null;
    	--count;
    	return data;
    }
    else
    {
    	E data = front.getData();
    	front = front.getNext();
    	--count;
    	return data;
    }
  }
  
  public E removeLast()
  {
	Link<E> temp = front;  
	while (temp.getNext() != null)
	{
		temp = temp.getNext();
	}
	E data = temp.getNext().getData();
	rear = temp;
	temp.setNext(null);
	return data;
  }
  
  public E First()
  {
	  return front.getData();
  }
  
  public E Last()
  {
	  return rear.getData();
  }

  public boolean isEmpty()
  {
    if (front == null)
      return true;
    return false;
  }
}
