import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ShinyObjects {
public static void main(String[] args) {
	// 2. Ask the user how many shiny objects they want
String s = JOptionPane.showInputDialog("how many shiny objects do you have?");
int i = Integer.parseInt(s);			

for (i, i>0, playMisterZee()) {
	
}


			// 1. Call the method below
playMisterZee();
}
private static Object i(boolean b, Object playMisterZee) {
	// TODO Auto-generated method stub
	return null;
}
public static void playMisterZee() {
	try {
		 File soundFile = new File("/Users/League/Google Drive/league-sounds/shiny-objects.wav");
		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		 Clip clip = AudioSystem.getClip();
		 clip.open(audioInputStream);
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
    	ex.printStackTrace();
	}
}


}
