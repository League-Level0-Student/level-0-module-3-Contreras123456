//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bigbird = new Robot();
	//3. Ask the user what color they would like the robot to draw
		while(true) {
	String color =	JOptionPane.showInputDialog("What color would you like your robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("red")) {
	bigbird.setPenColor(Color.RED);
}
else {
	bigbird.setRandomPenColor();
}
		
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bigbird.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)

bigbird.penDown();
bigbird.setSpeed(2);
bigbird.move(200);
bigbird.turn(90);
bigbird.move(200);
bigbird.turn(90);
bigbird.move(200);
bigbird.turn(90);
bigbird.move(200);


	}
	}
}
