package shopping;
import java.util.ArrayList;
public class Product implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String availability;
	private String product;

	public Product(String availability, String product) {
		this.availability = availability;
		this.product = product;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer ob : observers) {
			System.out.println("Notifying Observers on availability");
			ob.update(this.availability);
		}
	}
}