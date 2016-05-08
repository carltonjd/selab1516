public class CarClient {
public static void main(String args[]) {
SubSytem car = new SubSytem(); // Full Car

SubSytem engine = new SubSytem(); // Sub System
CarInterface piston = new Component(100);// Component
CarInterface carburator = new Component(250);
engine.addItem(piston);
engine.addItem(carburator);
car.addItem(engine);

SubSytem body = new SubSytem(); // Sub System
CarInterface door = new Component(150);// Component
CarInterface window = new Component(350);
engine.addItem(door);
engine.addItem(window);
car.addItem(body);

System.out.println(car.getPrice());

}
}