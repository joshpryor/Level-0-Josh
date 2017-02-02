


	import org.jointheleague.graphical.robot.Robot;
	import java.awt.Color;


	/*** Teacher's note ***/
	 /* Before beginning recipe: 
	 * 1. ask students to find and explain the variables in this recipe. 
	 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */

	public class FlamingNinjaStar {
		public static void main(String[] args) {

			int baseSize = 300;		//the size of the black part of the star
			int flameSize = 200;		//the length of the flaming arms

			// 1. Make a new robot, and set it's pen down.
Robot boy = new Robot ("vic");

boy .penDown();
			// *14. Use the methods setX and setY to move the ninja star into the center of the screen
			boy.setX(930); boy.setY(450);
			// *15. Make some adjustments to see what other kinds of shapes you can make.

			// 12. Set the robot speed to 10
boy.setSpeed(10);
			// 13. Make all the code below repeat 25 times
for (int i = 0; i < 25 ; i++) {
	

				
			boy.turn(360/8);
			
boy.move(65);
				
boy.setPenColor(Color.orange);	
				boy.turn(-40);
				// 5. Move the robot the distance in the variable flameSize
				boy.move(flameSize);
				// 6. Turn the robot 170 degrees
				boy.turn(170);
				// 7. Move the robot the distance in the variable flameSize (again)
				boy.move(flameSize);
				boy.setPenColor(Color.BLACK);// 8. Turn the robot 64 degrees to the right
boy.turn(64);				
				// 9. Move the robot the distance in the variable baseSize
				boy.move(baseSize);
				// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
			
		}boy.setSpeed(1111);
boy.turn(999999999);
		}
	





}

