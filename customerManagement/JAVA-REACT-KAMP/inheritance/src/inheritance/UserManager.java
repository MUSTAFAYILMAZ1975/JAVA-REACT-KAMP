package inheritance;

public class UserManager {
	
	  public void Add(User user) {
			
			System.out.println( user.firstName+"   "+" kaydedildi.");
		}
			
		public void Delete(User user) {
			
			System.out.println(user.firstName+ "silindi.");
		}
		
	    public void Update(User user) {
			
			System.out.println(user.firstName+ "güncellendi.");
		}

	    
	    public void addMultiple(User[] users) {
	    	
	    	for(User user : users) {
	    		Add(user);
	    	
	    	}
	    }
	    
}
