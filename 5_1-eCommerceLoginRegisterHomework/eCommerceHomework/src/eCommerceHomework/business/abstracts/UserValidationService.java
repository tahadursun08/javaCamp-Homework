package eCommerceHomework.business.abstracts;

import eCommerceHomework.entities.concretes.User;

public interface UserValidationService {
	public void validation(User user) throws Exception;
}
