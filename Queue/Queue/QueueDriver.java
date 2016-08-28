import com.queue.*;

public class QueueDriver 
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new Queue<Integer>(50);
		q.Enqueue(50);
		q.Enqueue(100);
		q.Enqueue(25);
		q.Dequeue();
	}
}
