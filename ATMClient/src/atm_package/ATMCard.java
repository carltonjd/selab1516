package atm_package;

public class ATMCard {
private int cardno;
private int pin;
ATMCard(int a,int p){
	this.cardno = a;
	this.pin =p;
}
int getPin(){
	return pin;
}
int getCardNumber(){
	return cardno;
}
}
