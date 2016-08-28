import java.util.Scanner;
import com.htmlmatch.*;

public class HTMLDriver
{
	public static void main(String[] args)
	{
		System.out.println("Enter String : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(HtmlMatch.isHTMLMatch(s));
		scan.close();
	}
}                                                                                                                                                                                                                                                                                                         