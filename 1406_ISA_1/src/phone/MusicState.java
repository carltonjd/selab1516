package phone;

public class MusicState extends MoblieState {
	private static MusicState MusicStateinstance;

	private MusicState(Mobile mobile) {
		setMobile(mobile);
	}

	public static MusicState createPhoneState(Mobile mobile) {
		if (MusicStateinstance == null)
			MusicStateinstance = new MusicState(mobile);
		System.out.println("Mobile is in phone mode");
		return MusicStateinstance;
	}

	@Override
	public void on() {
		System.out.println("Music app switched on");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Music app switched off");

	}

	@Override
	public void phone() {
		System.out.println("Switching from Music to Phone mode");
		mobile.changeState(PhoneState.createPhoneState(mobile));
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("Switching from Music to Camera mode");
		mobile.changeState(Camera.createCameraState(mobile));
	}
	
	public void music(){
		System.out.println("The mobile is already in music state");

	}

}
