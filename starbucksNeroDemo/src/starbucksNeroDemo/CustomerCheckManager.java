package starbucksNeroDemo;
//bu aslýnda mernis doðrulama deðilde baþka bir doðrulama kullanýlsa gibi düþünülebilir
public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
