package cal;

public class CalTest {

	public static void main(String[] args) {
//		1.
//		200과 100을 더해서,
//		300이 넘으면,
//			300에서 100을 빼서 프린트
//		300이 넘지 않으면,
//			300에 0.1을 곱해서 프린트
		
		int num1 = 100;
		int num2 = 100;
		int result = num1 + num2;
		
		if(result >= 300) {
			System.out.println(result - 100);
		}else {
			System.out.println(result * 0.1);
		}
		
		
		
//		2.
//		정수 400이 짝수인지 판별하세요.
//		(2로 나누어서 나머지가 0이면 짝수,나머지 연산자)
		int num3 = 500;
		int result2 = num3 % 2; 
		if(result2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		System.out.println("----삼항연산자로 출력");
		
		System.out.println(result2 == 0 ? "짝수" : "홀수" );
		
		
	}

}
