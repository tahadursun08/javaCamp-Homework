package eCommerceHomework.business.concretes;

import eCommerceHomework.business.abstracts.AuthCheckSerice;
import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.core.utils.ServiceUtils;
import eCommerceHomework.core.utils.message.ValidationMessage;
import eCommerceHomework.core.utils.result.ErrorResult;
import eCommerceHomework.core.utils.result.Result;
import eCommerceHomework.core.utils.result.SuccesResult;
import eCommerceHomework.entities.concretes.User;

public class AuthCheckManager implements AuthCheckSerice{
	
	private UserService userService;
	
	public AuthCheckManager(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public void checkRegister(String eMail, String password) throws Exception {
		Result[] results = ServiceUtils.runChecks(checkUser(eMail,password));
		this.check(results);
	}
	
	private void check(Result[] results) throws Exception{

		for (Result result : results) {
			System.out.println(result.isSuccess());
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
	}
	private Result checkUser(String eMail, String password) {
		User user = this.userService.get(u -> u.geteMail() == eMail && u.getPassword() == password);
		
		if (user!=null) {
			if(user.getStatus() != "Active") {
				return new ErrorResult(ValidationMessage.needActivateUser);
			}
			else {
				return new SuccesResult();
			}
		}
		else {
			return new ErrorResult(ValidationMessage.userEmailOrPasswordNotFound);
		}
		
	}

//	private Result checkUserIsActive(String eMail) {
//		if(this.userService.get(u -> u.geteMail() == eMail) != null) {
//			return new ErrorResult(ValidationMessage.eMailAlreadyExists);
//		}
//		
//		return new SuccesResult();
//	}

}
