package phone;

public abstract class MoblieState implements Operations {
	Mobile mobile;

	
	public abstract void phone(); 
	public abstract void camera(); 
	public abstract void music();
	public void setMobile(Mobile mobile)
	{
		this.mobile=mobile;
	}
}
