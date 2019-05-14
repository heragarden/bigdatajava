package 배열;

public class 위치바꾸기 {

	public static void main(String[] args) {
		int[] num = {66, 77, 88, 99};
		int imsi = num[0];
		num[0] = num[3];
		num[3] = imsi;
		for (int i : num) {
			System.out.println(i);
		}
	}
}



