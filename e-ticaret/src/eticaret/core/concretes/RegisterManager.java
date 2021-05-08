package eticaret.core.concretes;

import eticaret.core.abstracts.RegisterService;

public class RegisterManager implements RegisterService{


	public RegisterManager() {}
	
	@Override
	public void registerSystem(String email, String password, String firstName, String lastName) {
		System.out.println("Kayýt yapýldý.");
		
		
	}

	
	@Override
	public boolean checkUser(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void loginSystem(String email, String password) {
		System.out.println("Giriþ yapýldý.");
		
	}

	
   }
