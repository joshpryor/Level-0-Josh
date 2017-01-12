import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquareLoop {

	public static void main(String[] args) throws Exception {
		int SideStuff = 200;
		int Digrees = 180;
Robot tree =new Robot("batman");
		
tree.penDown();
tree.setSpeed(99999999);
tree.setPenColor (Color.CYAN);
for (int i = 0; i <360/Digrees; i++) {
tree.move(35);
tree.turn(Digrees);
}
	}

}
