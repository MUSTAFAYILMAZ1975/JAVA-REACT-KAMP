package customerManagement;

public class StarbucksCustomerManager extends BaseCustomerManager {

      private CustomerCheckService customerCheckService;
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer){
		
      
			
			super.save(customer);
       

	}
	
		

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return false;

	
	}
}
