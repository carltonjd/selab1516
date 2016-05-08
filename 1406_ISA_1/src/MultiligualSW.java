
public class MultiligualSW {
Translate toLanguage;
public boolean choseLang(String ch){
	if (ch == "French")
		toLanguage = new French();
		else if (ch == "German")
			toLanguage = new German();
		else if (ch == "Portuguese")
			toLanguage = new Portuguese();
		else
		return false;
	
	return true;
}



public void textTranslation(String i) {
// TODO Auto-generated method stub
	toLanguage.MakeTranslaton(i);
}

}

/*
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
*/