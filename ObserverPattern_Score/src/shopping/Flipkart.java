package shopping;

public class Flipkart implements Observer   {
	public void update(String avail) {
		System.out.println("Product is : " + avail);
	}
}
