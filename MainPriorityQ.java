import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainPriorityQ {

	public static void main(String[] args) {	
		//LinkedList
		//PriorityQueue
		
		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer(3.0);
		queue.offer(4.5);
		queue.offer(1.0);
		queue.offer(2.0);
		queue.offer(3.5);
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
