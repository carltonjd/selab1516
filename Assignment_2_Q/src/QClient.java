
public class QClient {
	public static void main(String args[]) {

		// Implement a Q of Integer Objects
		System.out.println("ArrayList Queue\n");

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

		System.out.println("\nArray Queue\n");
		QueueArray QA = new QueueArray(5);
		System.out.println("Queue empty : " + QA.isEmpty());
		QA.enQ(1);
		QA.enQ(2);
		QA.enQ(3);
		QA.enQ(4);
		QA.enQ(5);
		System.out.println("Queue full : " + QA.isFull());
		System.out.println("Dequeued : " + QA.deQ());
		System.out.println("Queue size is  : " + QA.Qsize());
		while (!QA.isEmpty()) {
			System.out.println("Dequeued : " + QA.deQ());
		}
	}
}
