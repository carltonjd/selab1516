
public class CarBody extends CarSubSys {
	CarDoor myCD;

	int getPrice() {
		int p = 0;
		p = p + myCD.getPrice();
		return p;

	}

	public void addPart(CarPart part) {
		// TODO Auto-generated method stub
		Class<? extends CarPart> classname = part.getClass();
		
		if (classname.getName() == "CarDoor")
			myCD = (CarDoor) part;

	}
}
