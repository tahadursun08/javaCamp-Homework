package gameShopHomework;

public class PersonCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public PersonCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void register(Customer customer) {
		boolean result=false;
		result=customerCheckService.checkPersonReal(customer);
		if (result==false) {
			return;
		} else {
			super.register(customer);
		}
	}

	@Override
	public void update(Customer customer) {
		super.register(customer);
	}

	@Override
	public void delete(Customer customer) {
		super.register(customer);
	}
	
	@Override
	public void addBulk(Customer[] customer) {
		for (Customer cust : customer) {
			this.register(cust);	
		}
	}
}
