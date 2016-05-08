
public class MP3 {

	private MP3State mp3state;

public MP3(){
	System.out.println("The mp3 player is created");
	this.mp3state=Stopped.createStoppedMP3(this);
}

public void changeState(MP3State mp3state)
{
	this.mp3state=mp3state;
}

public void pressPlay() {
	System.out.println("Play operation has been called");
	mp3state.pressPlay();
}

public void pressPause() {
	System.out.println("Pause operation has been called");
	mp3state.pressPause();
}

public void pressStop() {
	System.out.println("Stop operation has been called");
	mp3state.pressStop();
}

}
