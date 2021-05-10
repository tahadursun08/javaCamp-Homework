package eCommerceHomework.business.concretes;

import eCommerceHomework.business.abstracts.UserActivationService;
import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.dataAccess.abstracts.UserActivationDao;
import eCommerceHomework.entities.concretes.User;
import eCommerceHomework.entities.concretes.UserActivation;

public class UserActivationManager implements UserActivationService {

	private UserService userService;
	private UserActivationDao userActivationDao;
	public UserActivationManager(UserService userService, UserActivationDao userActivationDao) {
		this.userService = userService;
		this.userActivationDao = userActivationDao;
	}

	@Override
	public void add(User user) {
		String activationCode = "abc-123";
		this.userActivationDao.add(new UserActivation(1,user.getId(),activationCode));
	}

	@Override
	public void check(String activationCode) {
		if (activationCode=="abc-123") {
			System.out.println("Valid E-Mail");
		} else {
			System.out.println("Not Valid E-Mail");
		}
		
		
	}
	
	private void validationEmail() {
		System.out.println("Email doðrulandý");
	}

}
