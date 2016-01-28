
public class Remote implements TvOperationInterface {
	
	TV tv = new TV();
	
	@Override
	public boolean switchOn() {
		// TODO Auto-generated method stub
		tv.switchOn();
		return true;
	}

	@Override
	public boolean switchOff() {
		// TODO Auto-generated method stub
		tv.switchOff();
		return true;
	}

	@Override
	public boolean channelUp() {
		// TODO Auto-generated method stub
		tv.channelUp();
		return true;
	}

	@Override
	public boolean channelDown() {
		// TODO Auto-generated method stub
		tv.channelDown();
		return true;
	}
	
}
