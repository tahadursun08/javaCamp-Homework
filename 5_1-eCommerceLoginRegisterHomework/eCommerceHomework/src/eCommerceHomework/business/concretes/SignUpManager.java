package eCommerceHomework.business.concretes;

import eCommerceHomework.business.abstracts.BaseSignUpManager;
import eCommerceHomework.business.abstracts.UserService;

public class SignUpManager extends BaseSignUpManager {

	public SignUpManager(UserService userService) {
		super(userService);
	}

}
