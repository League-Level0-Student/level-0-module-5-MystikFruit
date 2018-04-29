import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		for (int i = 0; i < 999999999; i++) {
			String num = JOptionPane.showInputDialog("Tell me a number, and I'll not you if it's prime or not.");
			int num1 = Integer.parseInt(num);
			for (int j = 1; j < num1/2; j++) {
				if (num1 % j == 0) {
					JOptionPane.showMessageDialog(null, num1 + " is a prime number.");
				} else {
					JOptionPane.showMessageDialog(null, num1 + " is not a prime number. It is a composite number.");
				}

			}
		}
	}
}