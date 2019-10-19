//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob=new Robot();
		//3. Ask the user what color they would like the robot to draw
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	for (int i = 0; i < 5; i++) {
		String color = JOptionPane.showInputDialog("What color would you like your robot to draw?");
		if(color.equals("Blue.")) {
			rob.setPenColor(Color.BLUE);
		}
		else if(color.equals("Red.")) {
			rob.setPenColor(Color.RED);
		}
		else if(color.equals("Green.")) {
			rob.setPenColor(Color.GREEN);
		}
		  
		else{
			rob.setRandomPenColor();
		}
	
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
rob.penDown();
for (int i1 = 0; i1 < 4; i1++) {
	rob.move(100);
	rob.turn(90);
}


	}
	}
}
