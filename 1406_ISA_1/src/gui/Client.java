package gui;

public class Client {
	public static void main(String args[]) {
	Parent Main_Window = new Parent("Parent_1");
	
	Parent Child_Window_1 = new Parent("Child_Window_1");
	Child Child_Window_1_1=new Child("Child_Window_1_1");
	Child Child_Window_1_2=new Child("Child_Window_1_2");
	Child_Window_1.addItem(Child_Window_1_1);
	Child_Window_1.addItem(Child_Window_1_2);
	
	Parent Child_Window_2 = new Parent("Child_Window_2");
	Child Child_Window_2_1=new Child("Child_Window_2_1");
	Child Child_Window_2_2=new Child("Child_Window_2_2");
	Child_Window_2.addItem(Child_Window_2_1);
	Child_Window_2.addItem(Child_Window_2_2);
	Main_Window.addItem(Child_Window_1);
	Main_Window.addItem(Child_Window_2);
	Main_Window.minimize();
	Main_Window.close();

	}
}
