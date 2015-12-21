package atm_package;

public class CardReader {
	ATMCard card;

	int pin;

	private BankAccount acc;

	CardReader(ATMCard card2, BankAccount a) {
		card = card2;
		acc = a;
	}

	public boolean insertCard() {
		// TODO Auto-generated method stub
		if (acc.getCardNumber() == card.getCardNumber())
			return true;
		return false;
	}

	public void inputPin(int i) {
		// TODO Auto-generated method stub
		pin = i;
	}

	public boolean verifyPin() {
		// TODO Auto-generated method stub

		if (card.getPin() == pin)
			return true;

		return false;
	}

}
