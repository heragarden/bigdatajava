package java17;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWindow extends JFrame{
	public MyWindow() {
		setTitle("나는 윈도우 프레임");
		setSize(300, 300);
//		MyPanel p = new MyPanel();
//		add(p);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		JTextField text = new JTextField(20);
		add(text);
		JTextArea area = new JTextArea(5,5);
		add(area);
		JButton button = new JButton("나는 버튼");
		add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String test = text.getText(); 
				if(test.equals("")) {
					System.out.println("널");
				}else {
					System.out.println("널 아님.");
				}
				String test2 = area.getText(); 
				if(test2.equals("")) {
					System.out.println("널2");
				}else {
					System.out.println("널2 아님.");
				}
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}
}
