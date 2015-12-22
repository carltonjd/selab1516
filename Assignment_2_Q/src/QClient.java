
public class QClient {
	public static void main(String args[]) {

		// Implement a Q of Integer Objects

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

		// Implement a Q using Array as data structure

		System.out.println("\nArray Queue ");
	
		
		QueueArray QA = new QueueArray(5);
		System.out.println("Queue empty : " + QA.isEmpty());
		System.out.println("Queue empty : " + QA.isFull());
		QA.enQ(5);
		System.out.println("Dequeued : " + 		QA.deQ());

		System.out.println("Queue size is  : " + 		QA.Qsize());



	}
}
