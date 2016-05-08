import java.util.ArrayList;

class Score implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private int score;
	private String team;

	public Score(int score, String team) {
		this.score = score;
		this.team = team;
	}

	public float getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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
			System.out.println("Notifying Observers on change in Score");
			ob.update(this.score);
		}

	}

}