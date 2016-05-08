package phone;

public class PhoneState extends MoblieState{
	private static PhoneState PhoneStateinstance;

	private PhoneState(Mobile mobile) {
		setMobile(mobile);
	}

	public static PhoneState createPhoneState(Mobile mobile) {
		if (PhoneStateinstance == null)
			PhoneStateinstance = new PhoneState(mobile);
		System.out.println("Mobile is in phone mode");
		return PhoneStateinstance;
	}

	@Override
	public void on() {
		System.out.println("Phone switched on");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Phone switched off");

	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("The mobile is already in phone state");

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("Switching from Phone to  Camera mode");
		mobile.changeState(Camera.createCameraState(mobile));
	}
	public void music(){
		System.out.println("Switching from Phone to  music mode");
		mobile.changeState(MusicState.createPhoneState(mobile));

	}
}
