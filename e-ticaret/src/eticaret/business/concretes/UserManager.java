package eticaret.business.concretes;
import java.util.List;
import eticaret.business.abstracts.UserService;
import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entities.concretes.User;

public  class UserManager implements UserService{

	
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		if(user.getId()==1) {
			System.out.println("Bu kullanýcý kayýtlýdýr : " +user.getFirstName());
			return;
		}
		
		this.userDao.add(user);
	

	
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}
	
}