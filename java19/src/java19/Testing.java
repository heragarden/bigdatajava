package java19;

import javax.swing.*;
import java.awt.*;

class Testing {
	public void buildGUI() {
		JFrame f = new JFrame();

		f.setSize(300, 500);
		JPanel p = new JPanel();// <---for this line

		p.add(createPanel());
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.pack();
//		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	private JPanel createPanel() {
		JPanel panel2 = new JPanel();
		JButton b1 = new JButton("b111111111111111111111111111111111");
		JButton b2 = new JButton("b2111111111111111111111111111111111");
		JButton b3 = new JButton("b3111111111111111111111111111111111");
		JButton b4 = new JButton("b4111111111111111111111111111111111");
		JButton b5 = new JButton("b5111111111111111111111111111111111");
		JButton b6 = new JButton("b6111111111111111111111111111111111");
		JButton b11 = new JButton("b1111111111111111111111111111111111");
		JButton b21 = new JButton("b2111111111111111111111111111111111");
		JButton b31 = new JButton("b3111111111111111111111111111111111");
		JButton b41 = new JButton("b4111111111111111111111111111111111");
		JButton b51 = new JButton("b5111111111111111111111111111111111");
		JButton b61 = new JButton("b6111111111111111111111111111111111");
		JButton b111 = new JButton("b1111111111111111111111111111111111");
		JButton b211 = new JButton("b2111111111111111111111111111111111");
		JButton b311 = new JButton("b3111111111111111111111111111111111");
		JButton b411 = new JButton("b4111111111111111111111111111111111");
		JButton b511 = new JButton("b5111111111111111111111111111111111");
		JButton b611 = new JButton("b6111111111111111111111111111111111");
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		panel2.add(b6);
		panel2.add(b11);
		panel2.add(b21);
		panel2.add(b31);
		panel2.add(b41);
		panel2.add(b51);
		panel2.add(b61);
		panel2.add(b111);
		panel2.add(b211);
		panel2.add(b311);
		panel2.add(b411);
		panel2.add(b511);
		panel2.add(b611);
		final JScrollPane scrollPane = new JScrollPane(
				panel2, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(500, 800));
		JPanel panel = new JPanel();

		panel.setLayout(new BorderLayout());
		panel.add(scrollPane, BorderLayout.CENTER);
		panel.setPreferredSize(new Dimension(200, 300));
		panel.setVisible(true);

		return panel;
	}

	public static void main(String args[]) {
		new Testing().buildGUI();
	}
}