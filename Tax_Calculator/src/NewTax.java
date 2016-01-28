
public class NewTax implements TaxInterface {

	@Override
	public double Calc_Tax(double amt) {
		NewIT_API tax = new NewIT_API();
		return tax.taxcalculation(amt);
	}

}
