public class ObserverClient {
	public static void main(String args[]) {
		ESPN espn1 = new ESPN();
		StarSports HD1 = new StarSports();
		Score gameweek1 = new Score(3, "Man Utd");
		gameweek1.addObserver(espn1);
		gameweek1.addObserver(HD1);
		gameweek1.setScore(4);
		gameweek1.setScore(5);
	}
}