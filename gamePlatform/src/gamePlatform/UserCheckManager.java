package src.gamePlatform;

import src.Entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) 
	{
		
		return true;
	     
	}
}
