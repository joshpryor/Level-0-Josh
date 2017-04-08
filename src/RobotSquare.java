import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		
Robot tree =new Robot("batman");
		
tree.penDown();
tree.setSpeed(99999999);
tree.setPenColor (Color.CYAN);
for (int i = 1; i < 9999; i++) {
	
tree.setPenWidth(10);
tree.setRandomPenColor();
tree.move(200);
tree.turn(90);
}


	}
}

