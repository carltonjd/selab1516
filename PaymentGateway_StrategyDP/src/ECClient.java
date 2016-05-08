public class ECClient {

public static void main(String[] args) {
// TODO Auto-generated method stub
Item item = new Item();
EComsite flipkart = new EComsite();
flipkart.chosePaymentMethod("CCP");
flipkart.makepayment(item.getPrice());

}

}