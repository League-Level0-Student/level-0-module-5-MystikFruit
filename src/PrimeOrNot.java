import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {	
		for (int i = 0; i < 999999999; i++) {
			String num = JOptionPane.showInputDialog("Tell me a number, and I'll not you if it's prime or not.");
			int num1 = Integer.parseInt(num);
			if (num1 % 2 == 1) {
				JOptionPane.showMessageDialog(null, num1 + " is a prime number.");
			} else if (num1 % 3 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " is not a prime number. It's a composite number.");
			} else if (num1 % 4 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " is not a prime number. It's a composite number.");
			} else if (num1 % 5 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " is not a prime number. It's a composite number.");
			} else if (num1 % 6 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " is not a prime number. It's a composite number.");
			} else if (num1 % 7 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " is not a prime number. It's a composite number.");
			} else if (num1 % 8 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " is not a prime number. It's a composite number.");
			} else if (num1 % 9 == 0) {
				JOptionPane.showMessageDialog(null, num1 + " is not a prime number. It's a composite number.");
			} else {
				JOptionPane.showMessageDialog(null, num1 + " is a prime number.");
			}
		}
	}
}
