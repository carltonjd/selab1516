package ChainOfResponsibility;

public class FileNotFound extends ErrorHandler {

	   public FileNotFound(String level){
	      this.errorClass = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("File not found " + message);
	   }
	}