
public class QClient {
	public static void main (String args[]){
Queue<Integer> Q = new Queue<Integer>();
Q.enQ(5);
System.out.println("Dequeued : "+Q.deQ());
System.out.println("Queue empty : "+Q.isEmpty());
Q.enQ(6);

	}
}
