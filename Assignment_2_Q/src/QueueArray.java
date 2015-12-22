import java.util.NoSuchElementException;

public class QueueArray {
	protected int List[], front, rear, max_size, length;

	public QueueArray(int i) {
		max_size = i;
		List = new int[max_size];
		front = -1;
		rear = -1;
		length = 0;
	}

	public void enQ(int i) {
		// TODO Auto-generated method stub
		if (rear == -1) {
			front = 0;
			rear = 0;
			List[rear] = i;
			length++;

		} else if (rear + 1 < max_size) {
			List[++rear] = i;
			length++;
		} else
			System.out.println("Queue Full");
	}

	public int deQ() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			length--;
			int element = List[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else
				front++;
			return element;
		} else
			throw new NoSuchElementException("Underflow Exception");

	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front == -1;

	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return front == 0 && rear == max_size - 1;
	}

	public int Qsize() {
		// TODO Auto-generated method stub
		return length;
	}

}
