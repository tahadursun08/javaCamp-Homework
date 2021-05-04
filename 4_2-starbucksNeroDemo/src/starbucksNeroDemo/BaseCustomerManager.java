package starbucksNeroDemo;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
	}
	
}
