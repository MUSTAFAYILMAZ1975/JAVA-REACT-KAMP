package src.Entities;

public class GamerCategory extends User{

	int id;
	int userId;
	String name;
	public GamerCategory(int id, int userId, String name) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
