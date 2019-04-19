package control;

public class 캐릭터비교 {

	public static void main(String[] args) {
		String data = "2011557";
		char gender = ' '; //''사용 불가, '\u0000'사용 가능
		gender = data.charAt(0);
		if(gender == '1') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}

}
