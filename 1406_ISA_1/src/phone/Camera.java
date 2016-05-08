package phone;

public class Camera extends MoblieState  {
	private static Camera CameraStateinstance;

	private Camera(Mobile mobile)
	{
		setMobile(mobile);
	}
	public static Camera createCameraState(Mobile mobile)
	{
		if(CameraStateinstance == null)
			CameraStateinstance = new Camera(mobile);
		System.out.println("Mobile is in camera mode");
		return CameraStateinstance;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Camera switched on");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Camera switched off");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("Switching from Camera to Phone mode");
		mobile.changeState(PhoneState.createPhoneState(mobile));
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("The mobile is already in camera state");	

	}
	
	public void music(){
		System.out.println("Switching from Camera to  music mode");
		mobile.changeState(MusicState.createPhoneState(mobile));

	}

}
