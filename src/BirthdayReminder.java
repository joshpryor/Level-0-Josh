 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		
		String momsBirthday = "March 23";
		String dadsBirthday = "Augest 5000";
		String myBirthday = "September 8";
		String linconsBirthday = "february 12";
		
	String FamlyMember=JOptionPane.showInputDialog("whose birthday?");
		
		System.out.println(FamlyMember);
		
		if (FamlyMember.equals("mom")) {
		JOptionPane.showMessageDialog(null, momsBirthday);
		}
		
		else if (FamlyMember.equals("lincon")) {
		JOptionPane.showMessageDialog(null, linconsBirthday);
		
		}
		else if (FamlyMember.equals("dad")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}
		
	else if (FamlyMember.equals("josh")) {
		JOptionPane.showMessageDialog(null, myBirthday);
	}
		
	else {
		JOptionPane.showMessageDialog(null, "hoo dat");
	}
	} 
}
