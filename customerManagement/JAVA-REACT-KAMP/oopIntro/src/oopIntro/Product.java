package oopIntro;

public class Product {
	
public Product(int id,String name){
		
		System.out.println("Komut çalýþtý");
		
		this.id=id;
		this.name=name;
}
	
	public Product() {
	}
	

	  private int id; private String name; private double unitPrice; private String
	  detail; private int categoryId; private String kod;
	  
	  public int getId() { return id; } 
	  
	  public void setId(int id) { this.id = id; }
	  public String getName() { return name; }
	  
	  public void setName(String name) {
	  this.name = name; } public double getUnitPrice() { return unitPrice; }
	  
	  public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; } public
	  String getDetail() { return detail; } 
	  
	  public void setDetail(String detail) {
	  this.detail = detail; } public int getCategoryId() { return categoryId; }
	  
	  public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
	  public String getKod() { return this.name.substring(0, 1) + id; }
	  

}
