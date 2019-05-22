package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow4 extends JFrame{
	JButton b, b2; //전역변수로 선언.
	
	public MyWindow4() {
		setSize(300, 300);
		b = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");
		add(b);
		add(b2);
		
		setLayout(new FlowLayout());
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼..1");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼..2");
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow4 name = new MyWindow4();
	}

}






