package eticaret;

import eticaret.business.abstracts.UserService;
import eticaret.business.concretes.UserManager;
import eticaret.core.abstracts.RegisterService;
import eticaret.core.concretes.GoogleAdapter;
import eticaret.core.concretes.RegisterManager;
import eticaret.dataAccess.concretes.Hibernate;
import eticaret.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		UserService userService=new UserManager(new Hibernate());
		
		User user2=new User(1,"mstf","ylmz","12345","mstf@ylmz.com");
		userService.add(user2);
		
		User user3=new User(3,"abcf","ghjk","67890","abcd@ghjk.com");
		userService.add(user3);
		
		RegisterManager registerManager=new RegisterManager();
		registerManager.loginSystem("mstf@ylmz.com", "12345");
		
		GoogleAdapter gooleAdapter=new GoogleAdapter();
		gooleAdapter.singIn("mstf@ylmz.com", "12345");
	
		RegisterService registerService2=new RegisterManager();
		registerService2.loginSystem("mstf@ylmz.com", "12345");
		
		
		
	}
}
