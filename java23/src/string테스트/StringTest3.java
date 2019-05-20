package string테스트;

public class StringTest3 {

	public static void main(String[] args) {
		String s1 = "I am a java programmer";
		String s2 = "I am a python programmer";
		String s3 = "2011511";
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(7));
		System.out.println(s3.charAt(0));
		StringBuffer buffer = new StringBuffer("hello");
		StringBuffer buffer2 = new StringBuffer("hello");
		System.out.println(buffer.charAt(0));
		System.out.println(buffer.hashCode());
		System.out.println(buffer2.hashCode());
		
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 5));
		
	}
}






