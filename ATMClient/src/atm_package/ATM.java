package atm_package;

public class ATM {

	CashDispenser casher;
	BankAccount acc;
	ATMCard card;
	CardReader reader;

	RecieptPrinter reciept = new RecieptPrinter();
	Keyboard keyboard = new Keyboard();

	ATM(double b, ATMCard myCard, BankAccount myAccount) {
		casher = new CashDispenser(b);
		card = myCard;
		acc=myAccount;
		reader = new CardReader(card,acc);
	}

	void connectDB(BankAccount a) {
		acc = a;
	}

	CardReader getCardReader() {
		return reader;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public int withdraw() {
		// TODO Auto-generated method stub
		// Check if sufficient Balance in account
		if ((acc.getBalance() - keyboard.getAmt()) > acc.getMinimumBalace()) {
			if (casher.withdraw(keyboard.getAmt()) == 1) {
				setNewBalance();
				
				reciept.printer(acc.getAccountNumber(), acc.getBalance(), keyboard.getAmt());
				return 1;
			} else
				return 0;
		}
		return 0;

	}

	public void setNewBalance() {
		// TODO Auto-generated method stub
		acc.setBankBalance(acc.getBalance() - keyboard.getAmt());
	}
}
