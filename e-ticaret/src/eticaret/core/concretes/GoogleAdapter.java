package eticaret.core.concretes;

import eticaret.core.abstracts.GoogleService;
import eticaret.google.GoogleManager;

public class GoogleAdapter implements GoogleService {

	@Override
	public void singIn(String password, String email) {
		GoogleManager manager=new GoogleManager();
		manager.googleSignUp(email, password);
	}

}
