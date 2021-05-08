package eticaret.core.abstracts;

import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entities.concretes.User;

public interface UserCheckService {
	
	 boolean isValidFirstName(String firstName);

	    boolean isValidLastName(String lastName);

	    boolean isValidPassword(String password);

	    boolean isValidEmailFormat(String email);

	    boolean isUsedEmail(String email, UserDao userDao);

	    boolean isValidUser(User user, UserDao userDao);

	    boolean isCorrectLoginInput(String email, String password, UserDao userDao);


}
