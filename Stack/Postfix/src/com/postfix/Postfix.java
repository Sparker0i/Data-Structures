package com.postfix;

import com.stack.*;
import java.util.Scanner;

public class Postfix {
	String Input,Output;
	
	int precedence(char ch)
	{
		switch(ch)
		{
			case '+':
			case '-': return 1;
			case '*':
			case '/': return 2;
			case '^': return 3;
			case '(':
			case ')': return -1;
			default : return 0;
		}
	}
	
	public void convert() 
	{
		Output="";
		System.out.println("ENTERED");
		Stack<Character> A = new Stack<Character>(Input.length());
		for(char c : Input.toCharArray()) 
		{
			System.out.println("ENTERED in FOR " + c);
			if(precedence(c) == 0) 
			{
				Output+=c;
			}
			
			else if(c=='(') 
			{
				A.Push('(');
			}
			
			else if(c==')') 
			{
				while(A.peek()!='(') 
				{
					Output+=A.peek();
					A.Pop();
				}
				A.Pop();
			}
			
			else 
			{
				while(!A.isEmpty()) 
				{
					if(precedence(A.peek()) >= precedence(c)) 
					{
						Output+=A.peek();
						A.peek();
					}
					else
						break;
				}
				A.Push(c);
			}
		}
		while(!A.isEmpty()) 
		{
			Output+=A.peek();
			A.Pop();
		}
	}
	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY EXPRESSION : ");
		Input=sc.nextLine();
		sc.close();
	}
	
	public void output() 
	{
		convert();
		System.out.println(Output);
	}
}
