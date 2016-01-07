

public class Engine extends CarSubSys{
	Cylinder myCylinder;
	Piston myPiston;
	
	int getPrice(){
		int p=0;
		p=price+myCylinder.getPrice()+myPiston.getPrice();
		return p;
	}

	public void addPart(CarPart part) {
		// TODO Auto-generated method stub
		Class<? extends CarPart> classname =part.getClass();
		
		if (classname.getName()=="Cylinder")
			myCylinder=(Cylinder) part;	
		if (classname.getName()=="Piston")
			myPiston=(Piston) part;	
		
	}
	
}
