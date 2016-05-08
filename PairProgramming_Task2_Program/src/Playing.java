
public class Playing extends MP3State{

	private static Playing PlayingInstance;
	Playing(MP3 mp3){
		setMP3(mp3);
	}
	public static Playing createPlayingMP3(MP3 mp3)
	{
		if(PlayingInstance == null)
			PlayingInstance = new Playing(mp3);
		System.out.println("The mp3 is now in playing state");
		return PlayingInstance;
	}
	
	@Override
	public void pressPlay() {
		System.out.println("The mp3 is already playing");
	}

	@Override
	public void pressPause() {
		System.out.println("Pausing music, please wait");
		mp3.changeState(Paused.createPaused(mp3));

	}
	
	public void pressStop() {
		System.out.println("Stopping music, please wait");
		mp3.changeState(Stopped.createStoppedMP3(mp3));
	}
}
