import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SFX
{
	public static void playBoop(File sound)
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
	public static void playBounce(File sound)
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