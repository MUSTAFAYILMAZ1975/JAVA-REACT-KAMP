package src.gamePlatform;

import src.Entities.Gamer;
import src.Entities.User;

public abstract class BaseUserManager implements UserService {
	
	public void save(Gamer gamer) {
		System.out.println("Müþteri kaydedildi : " + gamer.getFirstName());
	}


}
