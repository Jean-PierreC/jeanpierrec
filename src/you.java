import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class you {

	public static void main(String[] args) {

		// 2. Ask the user how many shiny objects they want
String shiny=JOptionPane.showInputDialog("How many shiny objects do you want?");
int n = Integer.parseInt(shiny);
		// 3. Play the sound that many times
for (int i = 0; i < n; i++) {
	playMisterZee();

	
}
		// 1. Call the method below


	}

	public static void playMisterZee() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File(
							"/Users/Guest/Desktop/shiny-objects.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}




