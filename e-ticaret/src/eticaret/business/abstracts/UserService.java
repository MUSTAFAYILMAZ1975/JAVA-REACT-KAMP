package eticaret.business.abstracts;
import java.util.List;

import eticaret.entities.concretes.User;

public interface UserService {

	List <User> getAll();
	User getById(int id);
	User getByEmail(String email);
	void add(User user);
	void delete(User user);
	void update(User user);
	
	
}
