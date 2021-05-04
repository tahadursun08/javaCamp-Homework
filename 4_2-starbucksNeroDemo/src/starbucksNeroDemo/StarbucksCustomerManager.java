package starbucksNeroDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Do�rulama ba�ar�l�!");
			super.add(customer);
		} else {
			System.out.println("Do�rulama ba�ar�s�z!");
		}
		
	}

}
