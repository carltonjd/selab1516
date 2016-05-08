package shopping;

public class ObserverClient {
	public static void main(String args[]) {
		Flipkart flipkart = new Flipkart();
		Amazon amazon = new Amazon();
		Product dress = new Product("Not Available", "Dress");
		dress.addObserver(flipkart);
		dress.addObserver(amazon);
		dress.setAvailability("Not Available");
		dress.setAvailability("Available");
		
	}
}