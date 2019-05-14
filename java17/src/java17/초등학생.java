package java17;

public class 초등학생 extends 학생{
	int money; //용돈금액
	
	@Override //재정의
	public void 공부하다() {
		super.공부하다();
//		System.out.println("줄넘기 연습하다.");
	}
	
	public void ins() {
		System.out.println("인스를 가지고 놀다");
	}
}
