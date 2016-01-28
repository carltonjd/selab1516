
public class Client {
	public static void main(String args[]) {
		TvOperationInterface user1 = new Remote();
		user1.switchOn();
		user1.channelUp();
		user1.channelDown();
		user1.switchOff();
	}

}
