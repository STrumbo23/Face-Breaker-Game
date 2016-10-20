import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music 
{
	public static void playBitQuest(File sound)
	{
		try
		{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
