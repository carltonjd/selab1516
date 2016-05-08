package ChainOfResponsibility;

public class DivideByZero extends ErrorHandler {

	public DivideByZero(String level) {
		this.errorClass = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Divide by zero " + message);
	}
}