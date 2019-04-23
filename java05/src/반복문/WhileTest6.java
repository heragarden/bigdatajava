package 반복문;

public class WhileTest6 {

	public static void main(String[] args) {
		int start3 = 1; //초기값
		int mul = 1;
		while(start3 < 10) { //조건식
			//1부터 9까지 곱해줌.
			mul = mul * start3;
			start3 = start3 + 1;//start2++; 증감식
		}
		System.out.println(mul);
	}
}
