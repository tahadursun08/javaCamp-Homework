package eCommerceHomework.business.concretes;

import java.util.regex.Pattern;

import eCommerceHomework.business.abstracts.UserValidationService;
import eCommerceHomework.entities.concretes.User;
import eCommerceHomework.core.utils.ServiceUtils;
import eCommerceHomework.core.utils.message.ValidationMessage;
import eCommerceHomework.core.utils.result.ErrorResult;
import eCommerceHomework.core.utils.result.Result;
import eCommerceHomework.core.utils.result.SuccesResult;

public class UserValidationManager implements UserValidationService {

	@Override
	public void validation(User user) throws Exception {
		Result[] results = ServiceUtils.runValidates(
				this.checkFirstNameNotNull(user.getFirstName()),
				this.checkLastNameNotNull(user.getLastName()),
				this.checkEmailNotNull(user.geteMail()),
				this.checkPasswordNotNull(user.getPassword()),
				this.checkPasswordMinLength(user.getPassword()),
				this.checkEmailIsValid(user.geteMail()),
				this.checkFirstNameMinLength(user.getFirstName()),
				this.checkLastNameMinLength(user.getLastName()));
		this.check(results);
		
	}

	private void check(Result[] results) throws Exception {
			for (Result result : results) {
				if (!result.isSuccess()) {
					throw new Exception(result.getMessage());
				}
			}
	}

	private Result checkLastNameMinLength(String lastName) {
		if (lastName.length()<2) {
			return new ErrorResult(ValidationMessage.lastNameMustBeLeastTwoCharacter);
		}
		return new SuccesResult();
	}

	private Result checkFirstNameMinLength(String firstName) {
		if (firstName.length()<2) {
			return new ErrorResult(ValidationMessage.firstNameMustBeLeastTwoCharacter);
		}
		return new SuccesResult();
	}

	private Result checkEmailIsValid(String geteMail) {
		String regexString = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		if (!Pattern.compile(regexString).matcher(geteMail).matches()) {
			return new ErrorResult(ValidationMessage.eMailNotValid);
		}
		return new SuccesResult();
	}

	private Result checkPasswordMinLength(String password) {
		if (password.length()<6) {
			return new ErrorResult(ValidationMessage.passwordMustBeLeastSixCharacter);
		}
		return new SuccesResult();
	}

	private Result checkPasswordNotNull(String password) {
		if (password.isEmpty() || password == null) {
			return new ErrorResult(ValidationMessage.passwordCanNotBeNullOrEmpty);
		}
		return new SuccesResult();
	}

	private Result checkEmailNotNull(String geteMail) {
		if (geteMail.isEmpty() || geteMail == null) {
			return new ErrorResult(ValidationMessage.eMailCanNotBeNullOrEmpty);
		}
		return new SuccesResult();
	}

	private Result checkLastNameNotNull(String lastName) {
		if (lastName.isEmpty() || lastName == null) {
			return new ErrorResult(ValidationMessage.lastNameCantNullOrEmpth);
		}
		return new SuccesResult();
	}

	private Result checkFirstNameNotNull(String firstName) {
		if (firstName.isEmpty() || firstName == null) {
			return new ErrorResult(ValidationMessage.firstNameCantNullOrEmpth);
		}
		return new SuccesResult();
	}
}
