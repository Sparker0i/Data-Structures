import com.stack.*;
import java.util.Scanner;

public class ParanthesesDriver
{
  public static void main(String[] args)
  {
    int N;
    System.out.print("Enter Size : ");
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    System.out.println("Enter String : ");
    String S = scan.next();
    Parantheses para = new Parantheses();
    System.out.println(para.Match(S));
  }
}
