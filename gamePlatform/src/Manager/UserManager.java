package src.Manager;

import java.util.List;

import src.Entities.User;
import src.gamePlatform.UserCheckService;

public class UserManager implements IServiceRepository<User>{

	private UserCheckService _userCheckService;
	@Override
	public List<User> gettAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getbById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User entity) {
		System.out.println("User kaydedildi : "+ entity.getId());
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

}
