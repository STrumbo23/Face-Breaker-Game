import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SFX
{
	public static void playBoop()
	{
		try
		{
			File Boop = new File("src/Boop.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Boop));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void playBounce()
	{
		try
		{
			File Bounce = new File("src/Bounce.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Bounce));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
<<<<<<< HEAD
	
	public static void playBreak() {
		try
		{
			File Break = new File("Break.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Break));
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			Thread.sleep(clip.getMicrosecondLength()/500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
=======
>>>>>>> branch 'master' of https://github.com/Face-Breaker-Bridgewater/Face-Breaker-Game.git

}