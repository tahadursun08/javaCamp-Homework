package starbucksNeroDemo;
//bu asl�nda mernis do�rulama de�ilde ba�ka bir do�rulama kullan�lsa gibi d���n�lebilir
public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
