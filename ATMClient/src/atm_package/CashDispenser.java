package atm_package;

public class CashDispenser {
	private double balance;

	CashDispenser(double b) {
		this.balance = b;
	}

	public int withdraw(Double withdraw_amt) {
		if (withdraw_amt < balance) {
			balance -= withdraw_amt;
			return 1;
		} else {
			return 0;
		}
	}
}
