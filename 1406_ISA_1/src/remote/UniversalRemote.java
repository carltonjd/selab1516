package remote;

public class UniversalRemote {
	Devices device;

	public boolean choseDevice(String ch) {
		if (ch == "TV") {
			device = new TV();
			System.out.println("Remote connected to TV");
		} else if (ch == "VCR") {
			device = new VCR();
			System.out.println("Remote connected to VCR");
		} else
			return false;
		return true;
	}

	public boolean switchOn() {
		// TODO Auto-generated method stub
		device.switchOn();
		return false;
	}

	public boolean switchOff() {
		// TODO Auto-generated method stub
		device.switchOff();

		return false;
	}

	public boolean Play() {
		// TODO Auto-generated method stub
		device.Play();

		return false;
	}

	public boolean Pause() {
		// TODO Auto-generated method stub
		device.Pause();
		return false;
	}
}
