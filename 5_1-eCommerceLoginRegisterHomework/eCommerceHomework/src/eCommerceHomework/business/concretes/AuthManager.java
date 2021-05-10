package eCommerceHomework.business.concretes;

import eCommerceHomework.business.abstracts.AuthCheckSerice;
import eCommerceHomework.business.abstracts.AuthService;
import eCommerceHomework.business.abstracts.SignUpService;
import eCommerceHomework.business.abstracts.UserActivationService;
import eCommerceHomework.core.utils.message.ValidationMessage;
import eCommerceHomework.entities.concretes.User;

public class AuthManager implements AuthService{
	private SignUpService signUpService;
	private AuthCheckSerice authCheckSerice;
	private UserActivationService userActivationService;

	public AuthManager(SignUpService signUpService, AuthCheckSerice authCheckSerice, UserActivationService userActivationService) {
		this.signUpService = signUpService;
		this.authCheckSerice = authCheckSerice;
		this.userActivationService = userActivationService;
	}

	@Override
	public void login(String eMail, String password) {
		boolean thrown = false;
		try {
			this.authCheckSerice.checkRegister(eMail,password);
		} catch (Exception e) {
			thrown = true;
			e.printStackTrace();
		} finally {

			if(thrown==true) {
				System.out.println(ValidationMessage.userEmailOrPasswordNotFound);
			}
			else {
				System.out.println(ValidationMessage.successLogin);
			}
		}	
	}

	@Override
	public void register(User user) {
		this.signUpService.register(user);
		this.userActivationService.add(user);
	}
	
}
