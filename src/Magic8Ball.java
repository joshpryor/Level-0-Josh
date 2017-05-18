
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	static int r1() {
		return new Random().nextInt(4);
	}

	public static void main(String[] args) {

		// 3. Print out this variable

		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("ask a yes/no question");

		// 5. If the random number is 0
		if (r1() == 0) {
			JOptionPane.showInputDialog("YES");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		if (r1() == 1) {
			JOptionPane.showInputDialog("NO");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (r1() == 2) {
			JOptionPane.showInputDialog("Mabey you should ask Google?");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (r1() == 3) {
			JOptionPane.showInputDialog("ask your mom");
		}
		// -- write your own answer

	}
}