package java09;

import java.awt.FlowLayout;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화정보시스템2 {
	static int status = 2; //현재 위치값.

	public static void main(String[] args) {
		String[] movies = {"m1.PNG", "m2.PNG", "m3.PNG", "m4.PNG", "m5.PNG"};
//		String[] movies2 = new String[5];
		
		//자바는 필요한 부분의 부품(class)을 복사해서 
		//조립해서 코딩하는 방식
		//부품(객체, 대상)조립식 프로그램
		//객체지향형 프로그램(Object-Oriented Program, OOP)
		
//		Color.red : static(정적) 
//		new Button : instance
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화 정보 시스템");
		f.setSize(300, 450);
		//물흐르듯이 하나씩 순서대로 붙여주는 클래스
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img = new JButton();
		f.getContentPane().add(img);
		
		ImageIcon icon = new ImageIcon("m3.PNG");
		img.setIcon(icon);
		
		JButton b1 = new JButton("<<<<< 이전 >>>>>");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(status - 1 >= 0) {
					ImageIcon icon = new ImageIcon(movies[status-1]);
					img.setIcon(icon);
					status = status - 1;
				}else {
					JOptionPane.showMessageDialog(null, "왼쪽 마지막입니다. 다음버튼을 클릭해주세요.");
				}
			}
		});
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.GREEN);
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("<<<<< 이후 >>>>>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(status + 1 <= 4) {
					ImageIcon icon = new ImageIcon(movies[status+1]);
					img.setIcon(icon);
					status = status + 1;
				}else {
					JOptionPane.showMessageDialog(null, "오른쪽 마지막입니다. 이전버튼을 클릭해주세요.");
				}
			}
		});
		b2.setForeground(Color.GREEN);
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setBackground(Color.BLACK);
		f.getContentPane().add(b2);
		//객체화를 해주어야 string을 의미있게 인식한다.
//		URL url = new URL("http://www.naver.com");
//		File file = new File("c:/temp/test.txt");
//		SQL sql = new SQL("select * from member");
		
		f.setVisible(true);	
	}

}
