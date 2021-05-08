package src.Entities;

import java.time.LocalDate;

public class Gamer extends User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationality;
	private String identify;
	private int gameId;
	private String password;
	private LocalDate birthOfDate;
	private String address;
	private int gamerCategoryId;
	

	public Gamer(int id, String firstName, String lastName, String nationality, String identify, int gameId,
			String password, LocalDate birthOfDate, String address, int gamerCategoryId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.identify = identify;
		this.gameId = gameId;
		this.password = password;
		this.birthOfDate = birthOfDate;
		this.address = address;
		this.gamerCategoryId = gamerCategoryId;
	}
	public Gamer() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIdentify() {
		return identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGamerCategoryId() {
		return gamerCategoryId;
	}
	public void setGamerCategoryId(int gamerCategoryId) {
		this.gamerCategoryId = gamerCategoryId;
	}
	

}
