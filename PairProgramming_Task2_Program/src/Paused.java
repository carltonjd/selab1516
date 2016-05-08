
public class Paused extends MP3State{
	private static Paused Pausedinstance;

	Paused(MP3 mp3){
		setMP3(mp3);
	}
	
	public static Paused createPaused(MP3 mp3)
	{
		if(Pausedinstance == null)
			Pausedinstance = new Paused(mp3);
		System.out.println("The mp3 is now in paused state");
		return Pausedinstance;
	}
	
	@Override
	public void pressPlay() {
		
		System.out.println("Playing music, please wait");
		mp3.changeState(Playing.createPlayingMP3(mp3));
	}
	
	@Override
	public void pressPause() {
 	System.out.println("Mp3 is already paused");
	}

	public void pressStop() {
		System.out.println("Stopping music, please wait");
		mp3.changeState(Stopped.createStoppedMP3(mp3));	
	}

}