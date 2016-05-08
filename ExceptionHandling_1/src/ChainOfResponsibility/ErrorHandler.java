package ChainOfResponsibility;

public abstract class ErrorHandler {
	protected String errorClass;
	protected ErrorHandler nextHandler;

	public void setNextHandler(ErrorHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void handleE(Exception e) {
		if (this.errorClass == e.getClass().getName()) {
			write(e.getMessage());
		}
		if (nextHandler != null) {
			nextHandler.handleE(e);
		}
	}

	abstract protected void write(String message);
}
