

import java.net.URL;


	import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

	public class animalfarm {

		animalfarm() {
			/* 1. Ask the user which animal they want, then play the sound of that animal. */
			JOptionPane.showInputDialog("What animal do you want?");

			String  re= ("dog");
			/* 2. Make it so that the user can keep entering new animals. */
		}
		
		void playMoo(){
			playNoise(mooURL);
		}
		
		void playQuack(){
			playNoise(quackURL);
		}
		
		void playWoof(){
			playNoise(woofURL);
		}
		
		String quackURL = "https://github.com/joonspoon/league-jars/blob/master/quack.wav?raw=true";
		String mooURL = "https://github.com/joonspoon/league-jars/blob/master/moo.wav?raw=true";
		String woofURL = "https://github.com/joonspoon/league-jars/blob/master/woof.wav?raw=true";
		String meowURL = "https://github.com/joonspoon/league-jars/blob/master/meow.wav?raw=true";
		
		
		/* Ignore this stuff */

		public void playNoise(String soundURL) {
			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new URL(soundURL));
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
				Thread.sleep(3400);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		public static void main(String[] args) {
			new animalfarm();
		}
		
	

}


