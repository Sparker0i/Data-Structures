import com.queue.*;

public class Driver
{
  public static void main(String[] args)
  {
    Queue<Integer> q = new Queue<Integer>();
    q.Enqueue(5);
    q.Enqueue(3);
    q.Enqueue(2);
    q.Dequeue();
  }
}
