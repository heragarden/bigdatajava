package 여러함수다루기;

import java.awt.FlowLayout;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class rand {

	public static void main(String[] args) {

		// �����Լ��� ���� ����
		Random ran = new Random();

		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(50) + 1; // 0 ~ bound������ �������� ��ȯ���ش�

		// window, diallog, if�̿� ���ߴ� ���� �����
		JFrame f = new JFrame();

		f.setSize(500, 300);
		f.setLayout(null);

		int cnt = 10; // ��ȸ�� 10���� �ο�

//		int num = Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �Է��ϼ���[1~50] >> "));
		int num;

		while(true) {
			if(cnt<1) {
				System.out.println("��ȸ�� �� �����߽��ϴ�.");
				break;
			}
			
			while(true) {
				System.out.print("���ڸ� �Է��ϼ���[1~50] >> ");
				num = sc.nextInt();
				if(num>=1 && num<=50) {
					break;
				}
			}
			
			if (answer > num) {
				JOptionPane.showMessageDialog(null, "Down!");
			} else if (answer == num) {
				JOptionPane.showMessageDialog(null, "�����Դϴ�!");
			} else {
				JOptionPane.showMessageDialog(null, "Up!");
			}
			cnt--;
		}
		

		f.setVisible(true);

	}
}
