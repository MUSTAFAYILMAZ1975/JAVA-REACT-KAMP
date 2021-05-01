package oopIntro;

public class CategoryManager {


	
	public void Add(Category category) {
		
		System.out.println("Category eklendi" +  category.getCategoryName());
	}
		
	public void Delete(Category category) {
		
		System.out.println("Category silindi " +  category.getCategoryName());
	}

public void Update(Category category) {
		
		System.out.println("Category güncellendi " +  category.getCategoryName());
	}
}
