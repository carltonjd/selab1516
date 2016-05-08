package phone;

public class Mobile implements Operations{
	private MoblieState mobileState;


	public Mobile(){
		System.out.println("Phone switched on");
		this.mobileState=PhoneState.createPhoneState(this);
	}

	public void changeState(MoblieState mobileState)
	{
		this.mobileState=mobileState;
	}

	public void pressPhone() {
		System.out.println("Phone operation has been called");
		mobileState.phone();
	}

	public void pressCamera() {
		System.out.println("Camera operation has been called");
		mobileState.camera();
	}

	public void pressMusic() {
		System.out.println("Music operation has been called");
		mobileState.music();
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		mobileState.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		mobileState.off();
	}

}
