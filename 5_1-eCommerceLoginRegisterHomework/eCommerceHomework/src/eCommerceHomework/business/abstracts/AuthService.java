package eCommerceHomework.business.abstracts;

import eCommerceHomework.entities.concretes.User;

public interface AuthService {
	public void login(String eMail, String password);
	public void register(User user);
}
