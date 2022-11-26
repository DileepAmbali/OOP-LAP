import java.awt.Color;
import java.lang.ProcessBuilder.Redirect;
import java.util.concurrent.Flow;

import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.text.FlowView;

public class swingingWithPower extends JFrame {
	public swingingWithPower() {
		setTitle("My name Jeff");
		setSize(300, 220);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton jb = new JButton("FUk");
		JButton jb2 = new JButton("FUk2");
		setLayout(new GridLayout());
		add(jb);
		add(jb2);

	}

	public static void main(String[] args) {
		swingingWithPower s = new swingingWithPower();
		s.setVisible(true);
	}
}
