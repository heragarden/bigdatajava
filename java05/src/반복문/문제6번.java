package 반복문;

import java.util.Scanner;

public class 문제6번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("계절[1-4]를 입력(1:봄,2:여름,3:가을,4:겨울)");
			int data = sc.nextInt();
			if(1 <= data && data <=4) {      //1<= data <=4
				if(data == 1) {
					System.out.println("봄 입력");
				}else if(data == 2) {
					System.out.println("여름 입력");
				}else if(data == 3) {
					System.out.println("가을 입력");
				}else {
					System.out.println("겨울 입력");
				}
				break;
			}
		}
		sc.close();
	}
}





