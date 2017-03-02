import javax.swing.JOptionPane;

public class EverythigIsAwesome {
public static void main(String[] args) {
	String awesome= "";
	String cool= "";
	String rugby="";
	String marc= "";
	String josh= "";
	while (!awesome.equalsIgnoreCase("stop")) {
	
	
	awesome = JOptionPane.showInputDialog("enter A noun that is awesome");

	
	if (awesome.equalsIgnoreCase("marc")) {
		JOptionPane.showMessageDialog(null, awesome+" is not awesome");
	}
	else {
		
		
		JOptionPane.showMessageDialog(null, awesome+" is awesome");
	}
	cool = JOptionPane.showInputDialog("favorite food");
	JOptionPane.showMessageDialog(null, cool + "is awesome");
	rugby= JOptionPane.showInputDialog("best  friend");
	JOptionPane.showMessageDialog(null, rugby + "is awesome");
	marc = JOptionPane.showInputDialog("favorite book?");
	JOptionPane.showMessageDialog(null, marc + "is awesome");
	josh = JOptionPane.showInputDialog("best movie?");
	JOptionPane.showMessageDialog(null, josh + "is awesome");
	}
}
}