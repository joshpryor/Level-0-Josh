import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedantRobot {
	static Robot joe =new Robot("batman");
public static void main(String[] args) {
//	Make an obedient robot that will obey commands to draw shapes.

//	1. Make a new class, create a main method, and show the robot.

//	2. Have the robot draw a square.


//	3. Extract this code into a drawSquare() method.

//	4. Have the robot draw a triangle.

//	6. Have the robot draw a circle.

//	7. Extract this code into a drawCircle() method.

//	8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.
String joey = JOptionPane.showInputDialog("what shape do you want, Square, triangle, Circle, or DRAW ALL THREE");
//	9. Ask the user which color they want. Color the the shape depending on their answer.
if (joey.equalsIgnoreCase("square")) {
	drawSquare();
}
else if (joey.equalsIgnoreCase("triangle")) {
	drawTriangle();
}
else if (joey.equalsIgnoreCase("circle")) {
	drawCircle();
}
else if (joey.equalsIgnoreCase("DRAW ALL THREE")) {
	drawSquare();
	drawTriangle();
	drawCircle();
	
}
else {
	JOptionPane.showMessageDialog(null, "you did not spell it right,   please retry and choose from the given options");
}
}
static void drawSquare(){
	for (int i = 1; i < 5; i++) {
		joe.penDown();
		joe.setPenWidth(5);
		joe.setSpeed(99999);
		joe.setRandomPenColor();
		joe.move(200);
		joe.turn(90);
		}}
	static void drawTriangle(){
		for (int i = 1; i < 4; i++) {
			joe.penDown();
			joe.setPenWidth(5);
			joe.setSpeed(99999);
			joe.setRandomPenColor();
			joe.move(200);
			joe.turn(120);
			}}
		static void drawCircle(){
			for (int i = 1; i < 360; i++) {
				joe.penDown();
				joe.setPenWidth(5);
				joe.setSpeed(99999);
				joe.setRandomPenColor();
				joe.move(1);
				joe.turn(1);
				}
}
}
