package com.stack;

public class Stack<E>
{
  private int size , top;
  private E[] data;

  public Stack()
  {
    size = 100;
    data = (E[]) new Object[size];
    top = -1;
  }

  public Stack(int n)
  {
    size = n;
    data = (E[]) new Object[size];
    top = -1;
  }

  public int getSize()
  {
    return top + 1;
  }

  public E peek()
  {
    if (top == -1)
      return null;
    else
      return data[top];
  }

  public void Enqueue(E e)
  {
    if (top == size)
    {
      System.out.println("CAN'T ENTER MORE. STACK IS ALREADY FULL");
    }
    else
    {
      data[++top] = e;
    }
  }

  public E Dequeue()
  {
    if (top == -1)
    {
      System.out.println("CANNOT DEQUEUE ANYMORE . STACK IS ALREADY EMPTY");
      return null;
    }
    else
    {
      E temp = data[top];
      top--;
      return temp;
    }
  }

  public boolean isEmpty()
  {
    if (top == -1)
      return true;
    return false;
  }
}
