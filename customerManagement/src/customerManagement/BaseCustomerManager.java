package customerManagement;

public abstract class BaseCustomerManager implements CustomerService {
	
	public void save(Customer customer) {
		System.out.println("M��teri kaydedildi : " + customer.getFirstName());
	}


}
