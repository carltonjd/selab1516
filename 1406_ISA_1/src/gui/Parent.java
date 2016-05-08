package gui;
import java.util.ArrayList;

public class Parent implements WindowInterface {
	ArrayList<WindowInterface> subWindows = new ArrayList<WindowInterface>();
	String window_id;
	 public Parent(String i){
		 window_id=i;
	 }
	@Override
	public void minimize() {
		// TODO Auto-generated method stub
		for (WindowInterface X : subWindows)
			X.minimize();		
		System.out.println("Parent Window "+window_id+" minimizing");
			}
	public void close() {
		// TODO Auto-generated method stub
		for (WindowInterface X : subWindows)
			X.close();		
		System.out.println("Parent Window "+window_id+" closing");
			}

public void addItem(WindowInterface X) {
	subWindows.add(X);
}


}