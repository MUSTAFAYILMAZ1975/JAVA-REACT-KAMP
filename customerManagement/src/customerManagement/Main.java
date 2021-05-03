package customerManagement;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Mustafa ", "Yýlmaz", 1111,1234567890));
			
	}
}