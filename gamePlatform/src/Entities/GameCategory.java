package src.Entities;

public class GameCategory extends Game{
	
	int id;
	String name;
	int UserId;
	
	
	
	private GameCategory(int id, int userId, int score, String level, String name, int categoryId, int id2,
			String name2, int userId2) {
		super(id, userId, score, level, name, categoryId);
		id = id2;
		name = name2;
		UserId = userId2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}

}
