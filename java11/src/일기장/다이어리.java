package 일기장;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 다이어리 {
	public 다이어리() {
		JFrame f = new JFrame("나의 일기장 작성 화면");
		f.setSize(600, 700);
		JLabel l = new JLabel("일기장 작성 시작....");
		f.add(l);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setVisible(true);
	}
}
