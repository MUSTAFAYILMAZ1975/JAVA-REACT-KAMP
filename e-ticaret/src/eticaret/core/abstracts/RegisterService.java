package eticaret.core.abstracts;

public interface RegisterService {
	
	void registerSystem(String email, String password,String firstName,String lastName);
	void loginSystem(String email, String password);
    boolean checkUser(String email, String password) ;
	      
}
