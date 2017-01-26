import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String anser = "";
	String josh = "";
	anser = JOptionPane.showInputDialog(null, "are you happy");
	if (anser.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
	}
	else if (anser.equals("no")) {
	josh =	JOptionPane.showInputDialog("Do you want to be happy"); 
	
	
	if (josh.equals("yes")) {
		JOptionPane.showMessageDialog(null, "change somesomthing");
		
	}else if (josh.equals("no")) {
		JOptionPane.showMessageDialog(null, "keep doing what ever you are doing");
	}
	
}

}
}