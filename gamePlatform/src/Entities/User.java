package src.Entities;

public abstract class User {
	
	int id;
	String email;
	boolean status;
	
	public User() {}
	
	public User(int id, String email, boolean status) {
		super();
		this.id = id;
		this.email = email;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
