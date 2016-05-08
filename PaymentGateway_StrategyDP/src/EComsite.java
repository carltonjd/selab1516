public class EComsite {
Payment PayMethod;

public boolean chosePaymentMethod(String ch) {
if (ch == "COD")
PayMethod = new COD();
else if (ch == "CCP")
PayMethod = new CCP();
else
return false;

return true;
}

public void makepayment(int i) {
// TODO Auto-generated method stub
PayMethod.makepayment(i);
}

}