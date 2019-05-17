package java22;

import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerUser extends JFrame{

	public TimerUser() {
		setSize(300, 300);
		JLabel l = new JLabel("나야 나.....나라고..");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTest task = new TimerTest();
		System.out.println("5초 동안 게임을 할 수 있습니다.");
		timer.schedule(task, 5000);
	}

}
