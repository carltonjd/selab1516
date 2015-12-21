package atm_package;

public class RecieptPrinter {

	public RecieptPrinter() {
		// TODO Auto-generated constructor stub

	}
	void printer (String accountNumber, double balance, Double withdraw_amt){
		System.out.println("----------------------------------");
		System.out.println("\t ATM Reciept");
		System.out.println("----------------------------------");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
		System.out.println("Withdrawn Amount : " + withdraw_amt);
		System.out.println("----------------------------------");

	}

}
