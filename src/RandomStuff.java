import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RandomStuff {
public static void main(String[] args) {
	Robot neb =new Robot("batman");
	neb.penDown();
	neb.setSpeed(999999);
	neb.move(300);
	neb.turn(90);
	neb.move(300);
	neb.turn(90);
	neb.move(300);
	neb.turn(90);
	neb.move(300);
}
}
