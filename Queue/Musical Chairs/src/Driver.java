import com.queue.*;
import java.util.Scanner;

public class Driver 
{
	public static Queue<String> q = new Queue<String>();
	
	public static String Implement(int n)
	{
		while (q.getNum() > 1)
		{
			for (int i = 0; i < n; ++i)
				q.rotate();
			String s = q.Dequeue();
			System.out.println(s + " is out");
		}
		return q.Dequeue();
	}
	
	public static void main(String[] args)
	{
		String[] a = {"Alex" , "David" , "Steve" , "Ross" , "Joe" , "Phoebe"};
		for (int i = 0; i < a.length; ++i)
		{
			q.Enqueue(a[i]);
		}
		System.out.print("Enter A Random Number : ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println("WINNER IS : " + Implement(N));
		scan.close();
	}
}
