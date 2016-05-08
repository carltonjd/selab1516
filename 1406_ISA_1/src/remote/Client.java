package remote;

public class Client {
	public static void main(String args[]) {
	
		
		UniversalRemote remote = new UniversalRemote();
		remote.choseDevice("TV");
		remote.switchOn();
		remote.switchOff();
		remote.choseDevice("VCR");
		remote.switchOn();
		remote.switchOff();
	}
}
