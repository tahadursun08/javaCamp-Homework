package eCommerceHomework.business.concretes;

import eCommerceHomework.business.abstracts.UserCheckService;
import eCommerceHomework.core.utils.ServiceUtils;
import eCommerceHomework.core.utils.message.ValidationMessage;
import eCommerceHomework.core.utils.result.ErrorResult;
import eCommerceHomework.core.utils.result.Result;
import eCommerceHomework.core.utils.result.SuccesResult;
import eCommerceHomework.dataAccess.abstracts.UserDao;
import eCommerceHomework.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	private UserDao userdao;
	public UserCheckManager(UserDao userdao) {
		this.userdao = userdao;
	}
	@Override
	public void checkAdd(User user) throws Exception {
		Result[] results= ServiceUtils.runChecks(checkDublicateEmail(user.geteMail()));
		this.check(results);
	}
	private Result checkDublicateEmail(String geteMail) {
		
		if (this.userdao.get(u -> u.geteMail() == geteMail) != null) {
			return new ErrorResult(ValidationMessage.eMailAlreadyExists);
		}
		return new SuccesResult();
	}
	private void check(Result[] results) throws Exception {
		for (Result result : results) {
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
	}
	
	
}
