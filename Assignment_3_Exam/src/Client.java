
public class Client {
	public static void main(String args[]) {
		Car myCar = new Car();
		Engine myEngine = new Engine(); // Engine Subsystem
		Cylinder myCylinder = new Cylinder(); // Engine Part
		Piston myPiston = new Piston(); // Engine Part
		CarBody myCarbody = new CarBody(); // Car Body Subsystem
		CarDoor myDoor = new CarDoor(4);// Car body part

		myCarbody.addPart(myDoor);

		myEngine.addPart(myCylinder);
		myEngine.addPart(myPiston);

		myCar.addSubSystem(myEngine);
		myCar.addSubSystem(myCarbody);

		System.out.println("Total price of car is "+myCar.getPrice());
	}
}
