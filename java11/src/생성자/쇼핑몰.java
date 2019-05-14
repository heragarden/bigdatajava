package 생성자;

import java.util.Scanner;

public class 쇼핑몰 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가입할 정보를 입력해주세요.");
		System.out.print("가입할 이름: ");
		String name = sc.next();
		System.out.print("가입할 나이: ");
		int age = sc.nextInt();
		System.out.print("가입할 연락처: ");
		String tel = sc.next();
		System.out.print("가입할 주소: ");
		String addr = sc.next();
		
		Member m1 = new Member(name, age, tel, addr);
		System.out.println(m1);
		
		
		
		
		
		
		
		
		
	}
}






