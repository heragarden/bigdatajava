package window;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의두번째계산기4 {

	public static void main(String[] args) {
		JFrame	f = new JFrame("나의 두번째 계산기");
		f.setSize(671, 227);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JButton b = new JButton("누가 이기나 시합시작");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnNewButton = new JButton("가위");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setText("컴퓨터가 승리");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 65));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.YELLOW);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("바위");
		button.setForeground(Color.YELLOW);
		button.setFont(new Font("굴림", Font.PLAIN, 65));
		button.setBackground(Color.BLACK);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("보");
		button_1.setForeground(Color.YELLOW);
		button_1.setFont(new Font("굴림", Font.PLAIN, 65));
		button_1.setBackground(Color.BLACK);
		f.getContentPane().add(button_1);
		b.setForeground(Color.RED);
		b.setBackground(SystemColor.activeCaption);
		b.setFont(new Font("굴림", Font.PLAIN, 49));
		f.getContentPane().add(b);
		
		
		
		
		f.setVisible(true);
	}

}
