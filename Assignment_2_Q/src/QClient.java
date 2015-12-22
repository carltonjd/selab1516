
public class QClient {
	public static void main(String args[]) {
		Queue<Integer> integerQueue = new Queue<Integer>();
		integerQueue.enQ(4);
		System.out.println("Dequeued : " + integerQueue.deQ());
		System.out.println("Queue empty : " + integerQueue.isEmpty());
		integerQueue.enQ(5);
		System.out.println("Queue empty : " + integerQueue.isEmpty());
		integerQueue.enQ(6);
		integerQueue.enQ(7);
		integerQueue.enQ(8);
		System.out.println("Queue size is  : " + integerQueue.Qsize());
		while (!integerQueue.isEmpty()) {
			System.out.println("Dequeued : " + integerQueue.deQ());
		}

		// Implement a Q of String Objects

		Queue<String> stringQueue = new Queue<String>();
		System.out.println("\nString Queue ");
		stringQueue.enQ("A");
		System.out.println("Dequeued : " + stringQueue.deQ());
		System.out.println("Queue empty : " + stringQueue.isEmpty());
		stringQueue.enQ("A");
		stringQueue.enQ("B");
		stringQueue.enQ("C");
		stringQueue.enQ("D");
		System.out.println("Queue size is  : " + stringQueue.Qsize());
		while (!stringQueue.isEmpty()) {
			System.out.println("Dequeued : " + stringQueue.deQ());
		}

	}
}
