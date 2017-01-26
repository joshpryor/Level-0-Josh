import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot neb =new Robot("batman");
	
	neb.penDown();
	neb.setSpeed(8);
	neb.turn(180);
	neb.move(400);
	neb.turn(270);
	neb.move(200);
}
}
