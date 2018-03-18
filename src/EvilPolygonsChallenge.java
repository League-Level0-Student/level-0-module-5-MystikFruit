import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		Robot Rob = new Robot();

		Rob.setSpeed(100);

		int colorChoice = JOptionPane.showOptionDialog(null, "hello", null, JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Red", "Green", "Blue" }, 0);

		if (colorChoice == 0) {
			Rob.penDown();
			Rob.setPenColor(216, 39, 39);
			String NP = JOptionPane.showInputDialog("How many polygons do you want to be drawn");
			int NP1 = Integer.parseInt(NP);
			for (int i = 0; i < NP1; i++) {
				for (int j = 0; j < 4; j++) {
					Rob.move(100);
					Rob.turn(90);
				}
			}
		}
		if (colorChoice == 1) {
			Rob.penDown();
			Rob.setPenColor(28, 219, 50);
			String NP = JOptionPane.showInputDialog("How many polygons do you want to be drawn");
			int NP1 = Integer.parseInt(NP);
			for (int i = 0; i < NP1; i++) {
				for (int j = 0; j < 4; j++) {
					Rob.move(100);
					Rob.turn(90);
				}
			}
		}
		if (colorChoice == 2) {
			Rob.penDown();
			Rob.setPenColor(28, 145, 219);
			String NP = JOptionPane.showInputDialog("How many polygons do you want to be drawn");
			int NP1 = Integer.parseInt(NP);
			for (int i = 0; i < NP1; i++) {
				for (int j = 0; j < 3; j++) {
					Rob.move(100);
					Rob.turn(120);
				}
				
				Rob.turn(100);
			}
		}
		// 3. Set the pen color of the robot according to the value of the colorChoice
		// variable

		// 4. Ask the use how many polygons they want to be drawn.

		// 5. Use the robot to draw the number of polygons the user requested.

		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.

	}

	static void square() {

	}
}
