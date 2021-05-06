package gameShopHomework;

public class EDevletServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkPersonReal(Customer customer) {
		if (customer!=null) {
			System.out.println("id: "+customer.getId()+" Identity verified");
			return true;
		} else {
			return false;
		}
	}

}
