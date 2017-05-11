import javax.swing.JOptionPane;

public class ChangeCouculator {
public static void main(String[] args) {
	
	
	String nickles = JOptionPane.showInputDialog("how many nickles do you have");
	
	int n = Integer.parseInt(nickles);
			// Ask the user how many nickels they have

			// Convert their answer to an int using Integer.parseInt()

			// Ask the user how many dimes they have, and convert their answer
	String dimes = JOptionPane.showInputDialog("how many dimes do you have");
	
	int d = Integer.parseInt(dimes);
			// Ask the user how many quarters they have, and convert their answer
	String quartrs = JOptionPane.showInputDialog("how many quarters do you have");
	
	int q = Integer.parseInt(quartrs);
			// Calculate how much money the user has and save it in a double variable 
//  String omg = nickles + dimes + quartrs;
//	String omg = nickles + dimes + quartrs;
 double nic = n * 0.05;
 double dim = d * 0.1;
 double quart = q * 0.25; 
 
 double omg = nic + dim + quart;
			// Tell the user how much money they have
JOptionPane.showMessageDialog(null, " you have "+ omg + " dollers");

}
}
