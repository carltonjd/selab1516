package atm_package;

public class ATMClient {
	public static void main(String args[]) {
		BankAccount myAccount = new BankAccount("A1B2C3", 12345, 15000);
		ATMCard myCard = new ATMCard(12345, 4321);
		ATM atm = new ATM(50000, myAccount);
		atm.connectDB(myAccount);

		CardReader cardReader = atm.getCardReader();
		// Simulate interaction with user, User first inserts card, check if it belongs to valid account
		if (cardReader.insertCard(myCard)) {
			// User inputs pin, verify pin
			cardReader.inputPin(4321);
			if (cardReader.verifyPin()) {
				// Simulate withdraw operation
				Keyboard key = atm.getKeyboard();
				key.setAmt(1000);
				if (atm.withdraw() != 1) {
					System.out.println("Insufficient Bank/ATM  Balance");
				}

			} else {
				System.out.println("Incorrect Pin");
			}
		}

	}
}
