
public class Stopped extends MP3State{

	private static Stopped StoppedInstance;
	
	Stopped(MP3 mp3){
		setMP3(mp3);
	}
	
	public static Stopped createStoppedMP3(MP3 mp3)
	{
		if(StoppedInstance == null)
			StoppedInstance = new Stopped(mp3);
		System.out.println("The mp3 is now in Stopped state");
		return StoppedInstance;
	}
	
	@Override
	public void pressPlay() {
		System.out.println("Playing music, please wait");
	}

	@Override
	public void pressPause() {
		System.out.println("Pausing music, please wait");
		mp3.changeState(Paused.createPaused(mp3));

	}
	@Override
	public void pressStop() {
		System.out.println("The mp3 is already in stopped state");	
	}
}
