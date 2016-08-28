package com.queue;

public class Queue<E>
{
  private int size , front , count , rear;
  private E[] data;

  @SuppressWarnings("unchecked")
  public Queue()
  {
    size = 100;
    data = (E[]) new Object[size];
    front = -1;
    rear = -1;
    count = 0;
  }

  @SuppressWarnings("unchecked")
  public Queue(int n)
  {
    size = n;
    data = (E[]) new Object[size];
    front = -1;
    rear = -1;
    count = 0;
  }

  public int getNum()
  {
    return count;
  }

  public void Enqueue(E e)
  {
    if (rear == size)
    {
      System.out.println("CAN'T ENTER MORE. STACK IS ALREADY FULL");
    }
    else
    {
      if (isEmpty())
      {
        front++;
        rear++;
      }
      else
        rear++;
      data[rear] = e;
      count++;
    }
  }

  public E Dequeue()
  {
    if (front == size)
    {
      System.out.println("CANNOT DEQUEUE ANYMORE . STACK IS ALREADY EMPTY");
      return null;
    }
    else
    {
      E temp = data[front];
      front++;
      count--;
      return temp;
    }
  }

  public boolean isEmpty()
  {
    if (front == -1)
      return true;
    return false;
  }
}
