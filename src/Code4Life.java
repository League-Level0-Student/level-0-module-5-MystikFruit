
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		String TC = JOptionPane.showInputDialog("How many hours did you spend coding this week?");
		int TC1 = Integer.parseInt(TC);
		if (TC1 == 3) {
			JOptionPane.showMessageDialog(null, "You're a code ninja.");
		}
		if (TC1 == 4) {
			JOptionPane.showMessageDialog(null, "You're a code ninja.");
		}
		if (TC1 <= 2) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube, and write some code instead.");
		}
		if (TC1 >= 5) {
			playBatmanTheme();
		}
	}

	{

	}

	private static void playBatmanTheme() {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Code4Life.class.getResource("batman.wav")));
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}