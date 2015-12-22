
public class QClient {
	public static void main(String args[]) {
		Queue<Integer> Q = new Queue<Integer>();
		Q.enQ(4);
		System.out.println("Dequeued : " + Q.deQ());
		System.out.println("Queue empty : " + Q.isEmpty());
		Q.enQ(5);
		System.out.println("Queue empty : " + Q.isEmpty());
		Q.enQ(6);
		Q.enQ(7);
		Q.enQ(8);
		System.out.println("Queue size is  : " + Q.Qsize());
		while(!Q.isEmpty()){
			System.out.println("Dequeued : " + Q.deQ());
		}
		
//Implement a Q of String Objects
		
		Queue<String> QS = new Queue<String>();
		System.out.println("\nString Q ");

		QS.enQ("A");
		System.out.println("Dequeued : " + QS.deQ());
		System.out.println("Queue empty : " + QS.isEmpty());
		QS.enQ("A");
		QS.enQ("B");
		QS.enQ("C");
		QS.enQ("D");
		System.out.println("Queue size is  : " + QS.Qsize());
		while(!QS.isEmpty()){
			System.out.println("Dequeued : " + QS.deQ());
		}

	}
}
