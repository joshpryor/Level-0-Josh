import javax.swing.JOptionPane;

public class CangeCouculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nic =JOptionPane.showInputDialog("how many nickels?");
		// Convert their answer to an int using Integer.parseInt()
int oo =Integer.parseInt(nic);
		// Ask the user how many dimes they have, and convert their answer
String dim =JOptionPane.showInputDialog("how many dimes do you have?");
int mm = Integer.parseInt(dim);
		// Ask the user how many quarters they have, and convert their answer
String quart = JOptionPane.showInputDialog("how many quarters do you have?");
int gg = Integer.parseInt(quart);
		// Calculate how much money the user has and save it in a double variable
double o = oo*0.05;

double m= mm*0.1;

double g = gg*0.25;
double omg = o + m + g;
		// Tell the user how much money they have

JOptionPane.showMessageDialog(null,"you have this much money $"+ omg+ "");
	}
}



