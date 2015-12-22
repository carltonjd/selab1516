import java.util.ArrayList;

public class Queue<Item> {
	private ArrayList<Item> list = new ArrayList<Item>();

	public void enQ(Item i) {
		// TODO Auto-generated method stub
		list.add(i);
	}

	public Item deQ() {
		// TODO Auto-generated method stub
		return list.remove(0);
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	public int Qsize() {
		return list.size();
	}

}
