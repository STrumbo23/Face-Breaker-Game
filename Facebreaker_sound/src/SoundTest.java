import java.io.File;

public class SoundTest 
{

	public static void main(String[] args) 
	{
		File BitQuest = new File("BitQuest.wav");
		File Bounce = new File("Bounce.wav");
		File Boop = new File("Boop.wav");
		SFX.playBoop(Boop);
		SFX.playBounce(Bounce);
		Music.playBitQuest(BitQuest);
	


	}

}
