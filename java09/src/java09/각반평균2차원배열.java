package java09;

public class 각반평균2차원배열 {

	public static void main(String[] args) {
//		-------------------------
//		- 1반은 44, 55, 66
//		- 2반은 77, 88, 99, 100
//
//		- 각 반의 평균을 구하세요.
//		- 전체 출력
//		------------------------
		int[][] class12 = {
				{44, 55, 66},
				{77, 88, 99, 100}
		};
		
		int sum = 0;
		for (int i = 0; i < class12.length; i++) {
			for (int j = 0; j < class12[i].length; j++) {
				sum = sum + class12[i][j];
			}
			System.out.println(i+1 + "반의 평균은: " + sum/class12[i].length);
			sum = 0;
		}
		
		
		
		
		
		
		
		
		
	}

}
