package cal;

import java.util.Scanner;

public class 입력테스트2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		당신의 이름은?
		System.out.print("당신의 이름은? ");
		String name = sc.next();
		
//		당신의 년도는?
		System.out.print("당신의 태어난 연도는? ");
		int year = sc.nextInt();
		int age = 2019 - year + 1;
		
//		당신의 관심과목은?
		System.out.print("당신의 관심과목은? ");
		String title = sc.next();
		
//		--------------
		System.out.println("--------------");
		
//		김아무개님은 19살이고, 자바에 관심있습니다.
		System.out.println(name + "님은 " 
							+ age + "살이고, "
							+ title + "에 관심있습니다.");
		System.out.println("정확한 나이는 " + age);
	}

}
