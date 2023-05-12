package VillanuevaFinals;
import java.util.*;

public class Queues {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println("WALMART CHECKOUT 1 \n");
		System.out.println("On the Waiting Line: ");
		
		queue.offer("Karen");
		queue.offer("GigaChad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.toString().replace("[", "").replace("]", ""));
		
		queue.poll();
		queue.offer("Steven He");
		
		System.out.println("\nAfter Karen Checked out on the Waiting Line, \nAnother Customer waits on the Queue \n");
		System.out.println("On the Waiting Line: ");
		System.out.println(queue.toString().replace("[", "").replace("]", ""));
		
		queue.poll();
		queue.offer("Uncle Roger");
		
		System.out.println("\nAfter GigaChad Checked out on the Waiting Line, \nAnother Customer waits on the Queue \n");
		System.out.println("On the Waiting Line: ");
		System.out.println(queue.toString().replace("[", "").replace("]", ""));
	}
}
