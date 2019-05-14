package 배열;

public class 반복문으로배열에넣기 {

	public static void main(String[] args) {
		int[] num = new int[5];

		//1~5
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i : num) {
			System.out.println(i);
		}
		
	}

}
