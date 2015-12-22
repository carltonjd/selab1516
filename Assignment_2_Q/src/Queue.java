import java.util.LinkedList;

public class Queue<Item> {
	private LinkedList<Item> list = new LinkedList<Item>();

	public void enQ(Item i) {
		// TODO Auto-generated method stub
		list.addLast(i);
	}

	public Item deQ() {
		// TODO Auto-generated method stub
		return list.poll();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	public int Qsize() {
		return list.size();
	}

}
