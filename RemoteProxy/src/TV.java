
public class TV implements TvOperationInterface {

	@Override
	public boolean switchOn() {
		// TODO Auto-generated method stub
		System.out.println("TV switched on");
		return true;
	}

	@Override
	public boolean switchOff() {
		// TODO Auto-generated method stub
		System.out.println("TV switched off");
		return true;
	}
	
	@Override
	public boolean channelUp() {
		// TODO Auto-generated method stub
		System.out.println("TV channel up");
		return true;
	}

	@Override
	public boolean channelDown() {
		// TODO Auto-generated method stub
		System.out.println("TV channel down");
		return true;
	}
	

}
