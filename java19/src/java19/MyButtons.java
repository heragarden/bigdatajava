package java19;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButtons extends JFrame implements ActionListener{
	int i = 0;
	JButton[] buttons;
	public MyButtons() {
		setSize(500, 500);
		buttons = new JButton[5];
		setLayout(new FlowLayout());
		for (i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + " 번 버튼입니다.");
			add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyButtons();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}

}
