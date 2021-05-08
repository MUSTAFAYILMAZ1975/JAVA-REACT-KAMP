package eticaret.core.concretes;

import eticaret.core.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void sendVerificationMail(String email) {
		 System.out.println("Verification mail has send to " + email);
	        System.out.println("Email --> Verify your e-mail by clicking on this link: https://emailverificationlink.com/");
		
	}

}
