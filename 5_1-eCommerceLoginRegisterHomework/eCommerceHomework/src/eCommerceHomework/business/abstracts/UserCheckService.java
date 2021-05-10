package eCommerceHomework.business.abstracts;

import eCommerceHomework.entities.concretes.User;

public interface UserCheckService {
	void checkAdd(User user) throws Exception;
}
