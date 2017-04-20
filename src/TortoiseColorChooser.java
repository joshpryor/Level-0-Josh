


// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
String color = "";
Random random = new Random();
for (int i = 0; i < 7; i++) {
	

		//3. ask the user what color they would like the tortoise to draw
		color = JOptionPane.showInputDialog("what color do you you want your werid shape/thing. red green blue");
		
		//4. use an if/else statement to set the pen color that the user requested
if (color.equals("red")) {
	Tortoise.setPenColor(Color.red);
}
else if (color.equalsIgnoreCase("green")) {
	Tortoise.setPenColor(Color.green);
}
else if (color.equalsIgnoreCase("blue")) {
	Tortoise.setPenColor(Color.blue);
}
//5. if the user doesn’t enter anything, choose a random color
else {
	Tortoise.setPenColor(
	new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
	
}
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 5
Tortoise.setSpeed(10);
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(200);
Tortoise.turn(90);
Tortoise.move(200);
Tortoise.turn(90);
Tortoise.move(200);
Tortoise.turn(90);
Tortoise.move(200);
Tortoise.turn(90);
Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(100);
Tortoise.turn(135);
Tortoise.move(130);
Tortoise.turn(180);
Tortoise.move(270);
Tortoise.turn(45);
Tortoise.move(100);


	}
}}



