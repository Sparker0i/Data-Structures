package com.htmlmatch;
import com.stack.*;

public class HtmlMatch {
	public static boolean isHTMLMatch(String html)
	{
		Stack<String> buffer = new Stack<String>();
		int j = html.indexOf('<');			//First < Character
		while (j != -1)
		{
			int k = html.indexOf('>', j + 1);			//Next > Character
			if (k == -1)
				return false;			//Invalid Tag
			String tag = html.substring(j + 1 , k);
			if (!tag.startsWith("/"))
				buffer.Enqueue(tag);
			else
			{
				if (buffer.isEmpty())
					return false;
				if (!tag.substring(1).equals(buffer.Dequeue()))
					return false;
			}
			j = html.indexOf('<' , k + 1);
		}
		return buffer.isEmpty();
	}
}
