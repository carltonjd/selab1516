package ChainOfResponsibility;

public class OutOfBounds extends ErrorHandler {
	  public OutOfBounds(String level){
	      this.errorClass = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Outof Bounds " + message);
	   }
}
