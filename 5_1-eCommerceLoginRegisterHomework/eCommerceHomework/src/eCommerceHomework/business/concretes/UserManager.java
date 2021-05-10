package eCommerceHomework.business.concretes;

import java.util.List;
import java.util.function.Predicate;

import eCommerceHomework.business.abstracts.UserCheckService;
import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.business.abstracts.UserValidationService;
import eCommerceHomework.dataAccess.abstracts.UserDao;
import eCommerceHomework.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private UserValidationService userValidationService;
	private UserCheckService userCheckService;
	
	
	public UserManager(UserDao userdao, UserValidationService userValidationService, UserCheckService userCheckService) {
		this.userValidationService = userValidationService;
		this.userDao = userdao;
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		boolean thrown = false;
		try {
			this.userValidationService.validation(user);
			this.userCheckService.checkAdd(user);
			
		} catch (Exception e) {
			thrown = true;
			e.printStackTrace();
		} finally {
			if (!thrown) {
				this.userDao.add(user);
				System.out.println("User created : " + user.getFirstName() + " " + user.getLastName() + " -- " + user.geteMail());
			}
		}
		
	}

	@Override
	public void update(User user) {
		try {
			this.userValidationService.validation(user);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		this.userDao.add(user);
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}
	
	@Override
	public List<User> getAll(Predicate<User> predicate) {
		return this.userDao.getAll(predicate);
	}

	@Override
	public User get(Predicate<User> predicate) {
		return this.userDao.get(predicate);
	}
	
}
