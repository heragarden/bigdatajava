package java20;

import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;

public class Main2 extends JFrame {
	public Main2() {
		JPanel panel = new JPanel(); 
		panel.setLayout(null); 
		panel.setPreferredSize(new Dimension(380, 620));
		
		JButton[] buttons = new JButton[30];
		int y = 20;
		for (int i = 0; i < 30; i++) {
			buttons[i] = new JButton(i + "번째 버튼");
			buttons[i].setBounds(0, y, 100, 50);
			panel.add(buttons[i]);
			y = y + 20;
		}
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(panel);
		add(sp);
	}

	public static void main(String[] args) {
		Main2 main = new Main2();
		main.setSize(400, 400);
		main.setVisible(true);
	}
}
