package 스태틱;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws Exception {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
			System.out.println(sum);
			System.out.println();
		}
		FileWriter name = new FileWriter("test.txt");
		name.write("test1\n");
		name.write("test2\n");
		name.close();
	}
}
