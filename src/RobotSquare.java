import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		
Robot tree =new Robot("batman");
		
tree.penDown();
tree.setSpeed(99999999);
tree.setPenColor (Color.CYAN);
for (int i = 0; i < args.length; i++) {
	
}
tree.move(200);
tree.setPenColor (Color.green);

tree.turn(90);
tree.setPenColor(Color.MAGENTA);
tree.move(200);
tree.turn(90);
tree.setPenColor(Color.orange);
tree.move(200);
tree.turn(90);
tree.setPenColor(Color.red);
tree.move(200);
tree.turn(90);
	}
}

