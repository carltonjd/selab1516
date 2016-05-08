
public abstract class MP3State {
MP3 mp3;
public abstract void pressPlay(); 
public abstract void pressPause();
public abstract void pressStop();
public void setMP3(MP3 mp3)
{
	this.mp3=mp3;
}
}
