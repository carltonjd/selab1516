class ESPN implements Observer {
	public void update(int score) {
		System.out.println("ESPN: Score updated, new Score is: " + score);
	}
}