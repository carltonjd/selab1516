package translating;

public class French implements Translate {

	@Override
	public void MakeTranslaton(String text) {
		// TODO Auto-generated method stub
		FrenchReadyTranslation trans = new FrenchReadyTranslation();
		trans.Translaton(text);
	}

}
