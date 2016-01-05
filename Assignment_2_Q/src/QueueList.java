import java.util.ArrayList;

public class QueueList extends Queue {
	private ArrayList<Integer> list = new ArrayList<Integer>();

	public void enQ(int i) {
		// TODO Auto-generated method stub
		list.add(i);
	}

	public int deQ() {
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
