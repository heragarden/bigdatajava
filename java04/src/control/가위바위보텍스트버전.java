package control;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보텍스트버전 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.print("사용자 0)가위, 1)바위, 2)보 입력>>> ");
		int me = sc.nextInt();
		
		Random random = new Random();
		int computer = random.nextInt(3);
		System.out.println("컴퓨터는 " + computer);
		String win = null;
		if(me == 0) { //내가 가위
			if(computer == 0) { //컴퓨터가 가위
				win = "비겼음";
			}else if(computer == 1) { //컴퓨터가 바위
				win = "컴퓨터 승리";
			}else {			//컴퓨터가 보
				win = "내가 승리";
			}
		}
		if(me == 1) { //내가 바위
			if(computer == 0) { //컴퓨터가 가위
				win = "내가 승리";
			}else if(computer == 1) { //컴퓨터가 바위
				win = "비겼음";
			}else {			//컴퓨터가 보
				win = "컴퓨터 승리";
			}
		}
		if(me == 2) { //내가 보
			if(computer == 0) { //컴퓨터가 가위
				win = "컴퓨터 승리";
			}else if(computer == 1) { //컴퓨터가 바위
				win = "내가 승리";
			}else {			//컴퓨터가 보
				win = "비겼음";
			}
		}
		System.out.println(win);
		
		
		
		
		
		
		
		
		
	}

}
