package jdbc;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {

		JFrame lo = new JFrame("login");
		JPanel backPanel = new JPanel();
		lo.getContentPane().setBackground(Color.yellow);
		ImageIcon backIcon = new ImageIcon("diary.png");// 배경화면이미지선언
		JLabel back = new JLabel(backIcon);
		backPanel.add(back);
		lo.add(backPanel);
		
		JButton b = new JButton("나를 눌러요.");
		backPanel.add(b);
		backPanel.setLayout(null);
		back.setBounds(0, 0, 400, 400);
		b.setBounds(100, 100, 100, 100);
		
		lo.setSize(400, 400);
		lo.setVisible(true);
	}

}
