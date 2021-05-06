package gameShopHomework;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void register(Customer customer) {
		System.out.println("Customer registered. id : " + customer.getId() + " - User Code: " + customer.getUserCode());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer updated base. id : " + customer.getId());		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer deleted base. id : " + customer.getId());		
	}
	
	@Override
	public void addBulk(Customer[] customer) {
		for (Customer cust : customer) {
			this.register(cust);	
		}
	}
	
}
