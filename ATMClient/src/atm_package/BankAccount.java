package atm_package;

public class BankAccount {
	private String account_num;
	private int card_no;
	private double balance;

	BankAccount(String a, int c, double b) {
		this.account_num = a;
		this.card_no = c;
		this.balance = b;
	}

	String getAccountNumber() {
		return account_num;
	}

	int getCardNumber() {
		return card_no;
	}

	double getBalance() {
		return balance;
	}

	public double getMinimumBalace() {
		// TODO Auto-generated method stub
		return 1000;
	}

	public void setBankBalance(double d) {
		// TODO Auto-generated method stub
		this.balance = d;

	}

}
