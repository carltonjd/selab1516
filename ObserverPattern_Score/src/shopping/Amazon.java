package shopping;

public class Amazon implements Observer   {
	public void update(String avail) {
		System.out.println("Product is : " + avail);
	}
}
