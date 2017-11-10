import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		
	
	  //ask the user how many hours they spent coding this week.
	  String anser = JOptionPane.showInputDialog("how many hours of coding do you do each day");
	  //1. If it's 3 or more, tell them they're a Code Ninja.
	 int i =Integer.parseInt(anser);
	  if (i < 4) {
		  JOptionPane.showMessageDialog(null, "you are a code ninja");
	}
	  //2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	  else if (i <2) {
		JOptionPane.showMessageDialog(null, "stop watching youtube!");
	}
	 // 3. If it's more than 5, play the Batman theme song.
	  else if (i > 5) {
		JOptionPane.showMessageDialog(null, "play the bat man theam song");
		playBatmanTheme();
	}
	}
	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

