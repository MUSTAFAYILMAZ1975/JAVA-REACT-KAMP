package oopIntro;

public class ProductManager {
	
	public void Add(Product product) {
		
		System.out.println("�r�n eklendi" + product.getName());
	}
		
	public void Delete(Product product) {
		
		System.out.println("�r�n silindi " + product.getName());
	}
	
    public void Update(Product product) {
		
		System.out.println("�r�n g�ncellendi " + product.getName());
	}
}