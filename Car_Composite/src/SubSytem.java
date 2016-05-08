import java.util.ArrayList;

public class SubSytem implements CarInterface {
int price = 0;
ArrayList<CarInterface> Subsytems = new ArrayList<CarInterface>();

@Override
public int getPrice() {
// TODO Auto-generated method stub
for (CarInterface X : Subsytems)
price += X.getPrice();
return price;
}

public void addItem(CarInterface X) {
Subsytems.add(X);
}

}