package gui;

public class Child implements WindowInterface{
 String window_id;
 public Child(String i){
	 window_id=i;
 }
	@Override
	public void minimize() {
		// TODO Auto-generated method stub
		System.out.println("Window "+window_id+" minimizing");
	}
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Window "+window_id+" closing");
	}
}
