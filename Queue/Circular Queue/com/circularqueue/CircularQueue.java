package com.circularqueue;

public class CircularQueue<E>
{
  private int size , front , count;
  private E[] data;

  @SuppressWarnings("unchecked")
  public Queue()
  {
    size = 100;
    data = (E[]) new Object[size];
    front = -1;
    rear = -1;
  }

  @SuppressWarnings("unchecked")
  public Queue(int n)
  {
    size = n;
    data = (E[]) new Object[size];
    front = -1;
    rear = -1;
  }

  public int getSize()
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
      int index = (f + count) % data.length;
      data[index] = e;
      count++;
    }
  }

  public E Pop()
  {
    if (front == size)
    {
      System.out.println("CANNOT DEQUEUE ANYMORE . STACK IS ALREADY EMPTY");
      return null;
    }
    else
    {
      E temp = data[front];
      front = (front + 1) % data.length;
      return temp;
      count--;
    }
  }

  public void rotate()
  {
    int i, temp;
    temp = arr[front];
    for (i = 0; i < n-1; i++)
      arr[i] = arr[i+1];
    arr[i] = temp;
  }

  public boolean isEmpty()
  {
    if (count == 0)
      return true;
    return false;
  }
}
