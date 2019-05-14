package 일기장;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	public 로그인() {
		JFrame f = new JFrame("나의 일기장 로그인 화면");
		f.setSize(600, 400);
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("diary.png");
		l.setIcon(icon);
		
		FlowLayout flow = new FlowLayout();
		JPanel panel = new JPanel();
		panel.setSize(600, 400);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(panel);
		JButton btnNewButton = new JButton("나를 누르면 새창이 열려요.!");
		panel.add(l, 1);
		panel.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				다이어리 diary = new 다이어리();
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.YELLOW);
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		로그인  log = new 로그인();
	}
}
