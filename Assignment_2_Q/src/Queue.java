import java.util.LinkedList;

public class Queue<Item> {
	   private LinkedList<Item> list = new LinkedList<Item>();

	public void enQ(Item i) {
		// TODO Auto-generated method stub
		list.addLast(i);
	}

}
