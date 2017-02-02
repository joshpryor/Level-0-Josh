import javax.swing.JOptionPane;

public class EverythigIsAwesome {
public static void main(String[] args) {
	String awesome= "";
	while (!awesome.equalsIgnoreCase("stop")) {
	
	
	awesome = JOptionPane.showInputDialog("enter A noun that is awesome");
	if (awesome.equalsIgnoreCase("brocolli")) {
		JOptionPane.showMessageDialog(null, awesome+" is not awesome");
	}
	else {
		
	
	JOptionPane.showMessageDialog(null, awesome+" is awesome");
}}
}
}