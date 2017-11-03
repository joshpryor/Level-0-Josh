import javax.swing.JOptionPane;
import javax.swing.Spring;

public class RelationCheckpoint {
public static void main(String[] args) {
	String jop= JOptionPane.showInputDialog("how many cups of lofer do you have");
	int l = Integer.parseInt(jop);
	if (l<2) {
		JOptionPane.showMessageDialog(null, "go buy more flour!");
	}

		String where = JOptionPane.showInputDialog("how many people will you give cookies to?");
	
	int i = Integer.parseInt(where);
	if (i>30) {
		JOptionPane.showMessageDialog(null, "bake more cookies!");
	}
	String f = JOptionPane.showInputDialog("how many cookies do you have?");
	int j = Integer.parseInt(f);
	if (j == 2 ) {
		JOptionPane.showMessageDialog(null, "you are lucky you have so many friends");
	}
	else {
		JOptionPane.showMessageDialog(null, "you need two");
	}
	
}
}
