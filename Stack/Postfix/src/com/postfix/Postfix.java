package com.postfix;
import com.stack.*;

public class Postfix 
{
	public String PostfixEval (String S)
	{
		Stack<Character> s = new Stack<Character>();
		StringBuilder postfix = new StringBuilder();
		char elem;
		for (char c : S.toCharArray())
		{
			if (c == '(')
				s.Push(c);
			else if (c == ')')
			{
				while ((elem = s.Pop()) != '(')
				{
					postfix.append(elem);
				}
			}
			else if (c == '+' || c == '-')
			{
				if (s.isEmpty())
					s.Push(c);
				else
				{
					elem = s.Pop();
					do
					{
						postfix.append(elem);
						elem = s.Pop();
					}
					while ((elem != '(' || elem != ')') && !s.isEmpty());
					s.Push(elem);
				}
			}
			else if (c == '*' || c == '/')
			{
				if (s.isEmpty())
					s.Push(c);
				else
				{
					elem = s.Pop();
					do
					{
						s.Push(elem);
						elem = s.Pop();
					}
					while ((elem != '+' || elem != '-' ) && !s.isEmpty());
					s.Push(elem);
				}
			}
			else
				s.Push(c);
		}
		while (!s.isEmpty())
		{
			postfix.append(s.Pop());
		}
		return postfix.toString();
	}
}