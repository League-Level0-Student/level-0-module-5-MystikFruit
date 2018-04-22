
import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
		String name = JOptionPane.showInputDialog("Enter your name.");
		name = name.toUpperCase();

		System.out.println(name);
		for (int i = 0; i < name.length(); i++) {
			String letter = (name.substring(i, i + 1));
			if (i % 2 == 0) {
				letter = letter.toUpperCase();
			} else {
				letter = letter.toLowerCase();
			}
			goofyName = goofyName + letter;
		}
		System.out.println(goofyName);
	}
}
