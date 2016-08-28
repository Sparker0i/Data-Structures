import com.postfix.*;
import java.util.Scanner;

public class PostfixDriver {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = scan.nextLine();
		Postfix pf = new Postfix();
		String postfix = pf.PostfixEval(s);
		System.out.println(postfix);
	}
}
