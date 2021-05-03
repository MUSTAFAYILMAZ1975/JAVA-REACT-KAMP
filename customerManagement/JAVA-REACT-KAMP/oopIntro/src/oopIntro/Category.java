package oopIntro;

public class Category {
	
	
	public Category(int id,String categoryName){
		
		System.out.println("Komut çalýþtý");
		
		this.id=id;
		this.categoryName=categoryName;
	}
	
	public Category() {}
	
	private int id;
	private String categoryName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
 


}
