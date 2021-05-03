package oopIntro;

public class ProductManager {
	
	public void Add(Product product) {
		
		System.out.println("Ürün eklendi" + product.getName());
	}
		
	public void Delete(Product product) {
		
		System.out.println("Ürün silindi " + product.getName());
	}
	
    public void Update(Product product) {
		
		System.out.println("Ürün güncellendi " + product.getName());
	}
}