
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {

		Robot Rob = new Robot();

		Rob.setX(150);
		
		Rob.setY(200);

		Rob.penDown();

		Rob.setSpeed(10);

		for (int i = 0; i < 360; i++) {

			Rob.move(3);

			Rob.turn(1);
			
			if (i % 20 == 0) {
				
				for (int j = 0; j < 360; j++) {
					
					Rob.move(1);
					
					Rob.turn(1);
				}
			}
		}

	}
}