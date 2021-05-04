package starbucksNeroDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Doðrulama baþarýlý!");
			super.add(customer);
		} else {
			System.out.println("Doðrulama baþarýsýz!");
		}
		
	}

}
