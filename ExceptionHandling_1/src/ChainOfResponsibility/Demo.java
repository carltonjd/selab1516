package ChainOfResponsibility;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class Demo {

	private static ErrorHandler getChainOfHandlers() {
		ErrorHandler divby0 = new DivideByZero("java.lang.ArithmeticException");
		ErrorHandler Fnf = new FileNotFound("java.io.FileNotFoundException");
		ErrorHandler OoB = new OutOfBounds("java.lang.ArrayIndexOutOfBoundsException");
		divby0.setNextHandler(Fnf);
		Fnf.setNextHandler(OoB);
		return divby0;
	}
	
	public static void main(String[] args) {
		InputStream input = null;
	
		ErrorHandler handlerChain = getChainOfHandlers();
		
		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		} catch (Exception e) {
			handlerChain.handleE(e);
		}

		try {
			input = new FileInputStream("c:\\data\\input-text.txt");
			int data = input.read();
			while (data != -1) {
				System.out.println(data);
				data = input.read();
			}
		} catch (IOException e) {
			handlerChain.handleE(e);
		}

		try {
			int x = 0;
			System.out.println("Divide 5 with 0 : " + (5 / x));
		} catch (ArithmeticException e) {
			handlerChain.handleE(e);
		}
	}
}
