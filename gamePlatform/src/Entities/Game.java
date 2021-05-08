package src.Entities;

public class Game {
	private int id;
	private int userId;
	private int score;
	private String level;
	private String name;
	private int categoryId;
	
	public Game() {}
	
	public Game(int id, int userId, int score, String level, String name, int categoryId) {
		super();
		this.id = id;
		this.userId = userId;
		this.score = score;
		this.level = level;
		this.name = name;
		this.categoryId = categoryId;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
