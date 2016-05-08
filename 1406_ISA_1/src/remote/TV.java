package remote;

public class TV implements Devices{

	@Override
	public boolean switchOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv Switch on");
		return true;
	}

	@Override
	public boolean switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv Switch off");

		return true;
	}

	@Override
	public boolean Play() {
		// TODO Auto-generated method stub
		System.out.println("Tv playing");

		return true;
	}

	@Override
	public boolean Pause() {
		// TODO Auto-generated method stub
		System.out.println("Tv paused");

		return true;
	}

}
