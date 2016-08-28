import java.util.Scanner;
import com.parantheses.*;

public class ParanthesesDriver {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter String : ");
	    String S = scan.next();
	    Parantheses para = new Parantheses();
	    System.out.println(para.Match(S));
	    scan.close();
	}

}
