package eCommerceHomework.business.adapters;

import eCommerceHomework.business.abstracts.BaseSignUpManager;
import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.core.utils.message.ValidationMessage;
import eCommerceHomework.entities.concretes.User;
import eCommerceHomework.google.googleSignManager;

public class GoogleSignManagerAdapter extends BaseSignUpManager {
	
	public GoogleSignManagerAdapter(UserService userService) {
		super(userService);
	}
	
	@Override
	public void register(User user) {
		googleSignManager googleSignUpManager = new googleSignManager();
		boolean result = googleSignUpManager.login(user.geteMail());
		if(result) {
			super.register(user);
			System.out.println(ValidationMessage.googleSignUpSuccessful);
		}else {
			System.out.println(ValidationMessage.googleSignUpFailed);
		}
	}
}
