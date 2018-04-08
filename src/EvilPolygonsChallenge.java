import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		Robot Rob = new Robot();
		Robot.setWindowSize(1000, 1000);
		Rob.setSpeed(100);

		int colorChoice = JOptionPane.showOptionDialog(null, "Choose a color.", null, JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Red", "Green", "Blue" }, 0);

		if (colorChoice == 0) {
			Rob.penDown();
			Rob.setPenColor(216, 39, 39);
			String NP = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
			int NP1 = Integer.parseInt(NP);
			Rob.penDown();
			Rob.moveTo(20, 20);
			int S = 0;
			int P = 100;
			for (int i = 0; i < NP1; i++) {
				Rob.moveTo(S, P);
				for (int j = 0; j < 3; j++) {
					Rob.move(100);
					Rob.turn(120);
				}
				S += 100;
				if (S >= 1000) {
					S = 0;
					P += 120;
				}
			}
		}
		if (colorChoice == 1) {
			Rob.penDown();
			Rob.setPenColor(28, 219, 50);
			String NP = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
			int NP1 = Integer.parseInt(NP);
			Rob.penDown();
			Rob.moveTo(20, 20);
			int S = 0;
			int P = 100;
			for (int i = 0; i < NP1; i++) {
				Rob.moveTo(S, P);
				for (int j = 0; j < 3; j++) {
					Rob.move(100);
					Rob.turn(120);
				}
				S += 100;
				if (S >= 1000) {
					S = 0;
					P += 120;
				}
			}
		}
		if (colorChoice == 2) {
			Rob.penDown();
			Rob.setPenColor(28, 145, 219);
			String NP = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
			int NP1 = Integer.parseInt(NP);
			Rob.penDown();
			Rob.moveTo(20, 20);
			int S = 0;
			int P = 100;
			for (int i = 0; i < NP1; i++) {
				Rob.moveTo(S, P);
				for (int j = 0; j < 3; j++) {
					Rob.move(100);
					Rob.turn(120);
				}
				S += 100;
				if (S >= 1000) {
					S = 0;
					P += 120;
				}
			}
		}
	}

	static void square() {

	}
}
