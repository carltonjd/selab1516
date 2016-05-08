import java.io.*;
import java.util.Deque;

public class ExcepTest {

	public static void main(String args[]) {
		Deque<String> deque = null;
		InputStream input = null;

		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of Block 1");
		try {
			int x = 0;
			System.out.println("Divide 5 with 0 : " + (5 / x));
		} catch (ArithmeticException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of Block 2");
		try {
			input = new FileInputStream("c:\\data\\input-text.txt");
			int data = input.read();
			while (data != -1) {
				System.out.println(data);
				data = input.read();
			}
		} catch (IOException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of Block 3");

		try {
			deque.push("A");

		} catch (NullPointerException nullPointer) {
			System.out.println("Exception thrown  :" + nullPointer);
		}
		System.out.println("Out of Block 4");

	}

}