package com.parantheses;
import com.stack.*;

public class Parantheses
{
  final String opening = "({[" ;
  final String closing = ")}]";

  public boolean Match(String str)
  {
    Stack<Character> s = new Stack<Character>(50);
    for (char c : str.toCharArray())
    {
      if (opening.indexOf(c) != -1)     //Opening Tag
        s.Push(c);
      else if (closing.indexOf(c) != -1)    //Closing Tag
      {
        if (s.isEmpty())
          return false;
        if (closing.indexOf(c) != opening.indexOf(s.Pop()))
          return false;
      }
    }
    return s.isEmpty();
  }
}
