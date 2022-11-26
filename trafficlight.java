import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class trafficlight extends JFrame implements ItemListener {
	JRadioButton jr1;
	JRadioButton jr2;
	JRadioButton jr3;
	JTextField j1 = new JTextField(15);
	ButtonGroup b = new ButtonGroup();
	String msg = " ";
	int x = 0, y = 0, z = 0;

	public trafficlight(String msg) {
		super(msg);
		setLayout(new FlowLayout());
		jr1 = new JRadioButton("Red");
		jr2 = new JRadioButton("Yellow");
		jr3 = new JRadioButton("Green");

		jr1.addItemListener(this);
		jr2.addItemListener(this);
		jr3.addItemListener(this);

		add(jr1);
		add(jr2);
		add(jr3);
		b.add(jr1);
		b.add(jr2);
		b.add(jr3);
		add(j1);
		// addWindowListener(new WindowAdapter() {
		// public void windowClosing(WindowEvent e) {
		// System.exit(0);
		// }
		// });
	}

	public void itemStateChanged(ItemEvent ie) {
		if (ie.getSource() == jr1) {
			if (ie.getStateChange() == 1) {
				msg = "Stop!";
				x = 1;
				repaint();
			} else {
				msg = "";
			}
		}
		if (ie.getSource() == jr2) {
			if (ie.getStateChange() == 1) {
				msg = "Get Ready to go!";
				y = 1;
				repaint();
			} else {
				msg = "";
			}
		}
		if (ie.getSource() == jr3) {
			if (ie.getStateChange() == 1) {
				msg = "Go!!";
				z = 1;
				repaint();
			} else {
				msg = "";
			}
		}
		j1.setText(msg);
	}

	public void paint(Graphics g) {
		g.drawRect(195, 100, 110, 300);
		g.drawOval(220, 130, 60, 60);
		g.setColor(Color.WHITE);
		g.fillOval(220, 130, 60, 60);
		g.drawOval(220, 220, 60, 60);
		g.setColor(Color.WHITE);
		g.fillOval(220, 220, 60, 60);
		g.drawOval(220, 310, 60, 60);
		g.setColor(Color.WHITE);
		g.fillOval(220, 310, 60, 60);
		if (x == 1) {
			g.setColor(Color.RED);
			g.fillOval(220, 130, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(220, 220, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(220, 310, 60, 60);
			x = 0;
		}
		if (y == 1) {
			g.setColor(Color.WHITE);
			g.fillOval(220, 130, 60, 60);
			g.setColor(Color.YELLOW);
			g.fillOval(220, 220, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(220, 310, 60, 60);
			y = 0;
		}
		if (z == 1) {
			g.setColor(Color.WHITE);
			g.fillOval(220, 130, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(220, 220, 60, 60);
			g.setColor(Color.GREEN);
			g.fillOval(220, 310, 60, 60);
			z = 0;
		}
	}

	public static void main(String args[]) {
		JFrame jf = new trafficlight("Traffic Light");
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
}