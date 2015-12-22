
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
		QueueArray queueArray = new QueueArray(5);
		System.out.println("Queue empty : " + queueArray.isEmpty());
		queueArray.enQ(1);
		queueArray.enQ(2);
		queueArray.enQ(3);
		queueArray.enQ(4);
		queueArray.enQ(5);
		System.out.println("Queue full : " + queueArray.isFull());
		System.out.println("Dequeued : " + queueArray.deQ());
		System.out.println("Queue size is  : " + queueArray.Qsize());
		while (!queueArray.isEmpty()) {
			System.out.println("Dequeued : " + queueArray.deQ());
		}
	}
}
