package control;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저기요!!!");
		System.out.println("-----------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("-----------");
		System.out.println("1)짜장면, 2) 짬뽕, 3) 우동");
		System.out.println("-----------");
		System.out.print("당신의 선택은? ");
		// 콘솔에서 입력class
		int food = sc.nextInt(); // 메소드==함수, 명령어
		if (food == 1) {
			System.out.println("짜장면을 선택 주문!!!");
		} else if (food == 2) {
			System.out.println("짬뽕을 선택 주문!!!");
		} else if (food == 3) {
			System.out.println("우동을 선택 주문!!!");
		} else {
			System.out.println("다시 선택해주세요. 없는 메뉴입니다.");
		}
	} // main end.
}// class end.
