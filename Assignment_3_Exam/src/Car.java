public class Car {
	private int Total_Price = 0;
	Engine myEngine;
	CarBody myBody;

	public void addSubSystem(CarSubSys subsys) {
		// TODO Auto-generated method stub
		Class<? extends CarSubSys> classname = subsys.getClass();
		
		if (classname.getName() == "Engine")
			myEngine = (Engine) subsys;
		if (classname.getName() == "CarBody")
			myBody = (CarBody) subsys;

	}

	public int getPrice() {
		// TODO Auto-generated method stub
		Total_Price = myEngine.getPrice() + myBody.getPrice();
		return Total_Price;

	}

}
