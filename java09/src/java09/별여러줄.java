package java09;

public class 별여러줄 {

	public static void main(String[] args) {
		//10줄 프린트
		for (int i = 0; i < 10; i++) {
			//1줄 프린트
			for (int j = 0; j < 10; j++) {
				System.out.print("★");
			}	
			System.out.println();
		}
	}

}
