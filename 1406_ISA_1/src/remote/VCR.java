package remote;

public class VCR implements Devices {

	@Override
	public boolean switchOn() {

		System.out.println("VCR switched on");

		return true;
	}

	@Override
	public boolean switchOff() {

		System.out.println("VCR switched off");

		return true;
	}

	@Override
	public boolean Play() {

		System.out.println("VCR playing");

		return true;
	}

	@Override
	public boolean Pause() {

		System.out.println("VCR paused");

		return true;
	}

}
