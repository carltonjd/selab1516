
public class Client {
	public static void main(String args[]){
		TaxInterface tax = new NewTax();
		System.out.println("Tax amount is " + tax.Calc_Tax(5000));
	}
	
}
