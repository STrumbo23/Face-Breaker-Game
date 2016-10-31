import java.io.File;

import javax.sound.sampled.*;

public class Music 
{
	public static void playBitQuest()
	{
		try
		{
			File f = new File("src/BitQuest.wav");
			Clip clip = AudioSystem.getClip();
			AudioInputStream ais = AudioSystem.getAudioInputStream(f);
	        clip.open(ais);
	        clip.start();
	        Thread.sleep(clip.getMicrosecondLength()/500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
