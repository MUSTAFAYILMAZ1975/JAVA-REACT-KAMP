package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenova V14");
		product1.setUnitPrice(1500);
		product1.setDetail("16 GB Ram");
		product1.setCategoryId(1);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("LG TV");
		product2.setUnitPrice(6500);
		product2.setDetail(" 55inç Black Oled ");
		product2.setCategoryId(1);

		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Çocuk Odasý");
		product3.setUnitPrice(6500);
		product3.setDetail("Süper Kahraman Desenli ");
		product3.setCategoryId(2);

		
		Product[] products = { product1, product2, product3 };
		for (Product product : products) {

			System.out.println(product.getName());
			
		}
		System.out.println(products.length);
		
		System.out.println("***********************************");
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Elektronik");

		Category category2 = new Category();
		category2.setId(2);
		category2.setCategoryName("Mobilya");


		Category[] categories = { category1, category2 };
		for (Category category : categories) {

			System.out.println(category.getCategoryName());
			
		}
		System.out.println(categories.length);
		
		System.out.println("***********************************");
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product1);
		productManager.Delete(product2);
		productManager.Update(product3);
		
		System.out.println("***********************************");

		CategoryManager categoryManager=new CategoryManager();
		categoryManager.Add(category1);
		categoryManager.Delete(category2);

	}
}
