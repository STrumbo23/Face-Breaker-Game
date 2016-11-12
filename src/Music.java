import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javafx.scene.media.AudioClip;

public class Music 
{
	public static void playYaverclap()
	{
		try
		{
			File Yaverclap = new File("src/Yaverclap.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Yaverclap));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
