package eticaret.dataAccess.concretes;

import java.util.List;
import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entities.concretes.User;

public class Hibernate implements UserDao {

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		System.out.println("Hibernet ile eklendi : "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



}
