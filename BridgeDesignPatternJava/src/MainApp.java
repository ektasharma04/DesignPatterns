import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainApp {

	public static void main(String args[])
	{
		List myList1 = new ArrayList();
		List myList2 = new Vector();
		Queue myQueue1 = new FIFOQueue(myList1);
		Queue myQueue2 = new PriorityQueue(myList2);
		for (int i = 0; i < 100; i++) 
		{
			int n = (int) (Math.random() * 100);
			myQueue1.enqueue(n);
			myQueue2.enqueue(n);
		}
		System.out.println("FIFO output:");
		while(! myQueue1.isEmpty()) 
		{
			int n = myQueue1.head();
			System.out.print(n + " ");
			myQueue1.dequeue();
		}
		System.out.println();
		System.out.println("Sorted output:");
		while(! myQueue2.isEmpty()) 
		{
			int n = myQueue2.head();
			System.out.print(n + " ");
			myQueue2.dequeue();
		}
		System.out.println();
	}
}
