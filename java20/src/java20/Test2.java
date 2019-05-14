package java20;

public class Test2 {
	String name;
	
	public Test2(String name2) {
		this.name = name2;
		System.out.println(name2);
	}
	
	public Test2() {
		System.out.println("test: " + Test.name);
	}
	
	public void call(String name2) {
		this.name = name2;
		System.out.println(name2);
	}
}
