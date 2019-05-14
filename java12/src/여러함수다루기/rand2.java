package 여러함수다루기;

import java.awt.FlowLayout;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class rand2 {

	public static void main(String[] args) {

		// �����Լ��� ���� ����
		Random ran = new Random();

		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(50) + 1; // 0 ~ bound������ �������� ��ȯ���ش�

		// window, diallog, if�̿� ���ߴ� ���� �����
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(102, 204, 204));

		f.setSize(500, 300);
		f.getContentPane().setLayout(null);
		
		// Ʋ�����
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC790\uC785\uB825 : ");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel.setBounds(36, 25, 116, 31);
		f.getContentPane().add(lblNewLabel);
		
		JTextField n1 = new JTextField();
		n1.setBounds(166, 28, 116, 24);
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		
		JLabel lastchance = new JLabel("\uB0A8\uC740\uAE30\uD68C!!");
		lastchance.setFont(new Font("����", Font.PLAIN, 30));
		lastchance.setBounds(93, 74, 148, 60);
		f.getContentPane().add(lastchance);
		
		JLabel ud = new JLabel("UP and DOWN!");
		ud.setFont(new Font("����", Font.PLAIN, 30));
		ud.setBounds(93, 146, 237, 92);
		f.getContentPane().add(ud);

		int cnt = 10; // ��ȸ�� 10���� �ο�
		
//		int num = Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �Է��ϼ���[1~50] >> "));
		
		int num;
		
		
		while(true) {
			num = Integer.parseInt(n1.getText());
			if(cnt<1) {
				System.out.println("��ȸ�� �� �����߽��ϴ�...");
				break;
			}
			
			while(true) {
				if(num>=1 && num<=50) {
					break;
				}else {
					lastchance.setText("1~50 ������ ���ڸ� �Է�!");
				}
			}
			
			if (answer > num) {
				ud.setText("Down!");
				lastchance.setText("������ȸ : "+cnt+"��");
			} else if (answer == num) {
				ud.setText("Correct!");
				lastchance.setText((10-cnt)+"���� ����!");
			} else {
				ud.setText("Up!");
				lastchance.setText("������ȸ : "+cnt+"��");
			}
			cnt--;
		}
		

		f.setVisible(true);

	}
}
