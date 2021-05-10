package eCommerceHomework;

import java.util.List;

import eCommerceHomework.business.abstracts.AuthCheckSerice;
import eCommerceHomework.business.abstracts.AuthService;
import eCommerceHomework.business.abstracts.BaseSignUpManager;
import eCommerceHomework.business.abstracts.SignUpService;
import eCommerceHomework.business.abstracts.UserActivationService;
import eCommerceHomework.business.abstracts.UserCheckService;
import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.business.abstracts.UserValidationService;
import eCommerceHomework.business.adapters.GoogleSignManagerAdapter;
import eCommerceHomework.business.concretes.AuthCheckManager;
import eCommerceHomework.business.concretes.AuthManager;
import eCommerceHomework.business.concretes.SignUpManager;
import eCommerceHomework.business.concretes.UserActivationManager;
import eCommerceHomework.business.concretes.UserCheckManager;
import eCommerceHomework.business.concretes.UserManager;
import eCommerceHomework.business.concretes.UserValidationManager;
import eCommerceHomework.dataAccess.abstracts.UserActivationDao;
import eCommerceHomework.dataAccess.abstracts.UserDao;
import eCommerceHomework.dataAccess.concretes.HibernateUserActivationDao;
import eCommerceHomework.dataAccess.concretes.HibernateUserDao;
import eCommerceHomework.entities.concretes.User;
import eCommerceHomework.google.googleSignManager;

public class Main {

	public static void main(String[] args) {
		UserDao userDao = new HibernateUserDao();
		UserValidationService userValidationService = new UserValidationManager();
		UserCheckService userCheckService = new UserCheckManager(userDao);
		UserService userService = new UserManager(userDao, userValidationService, userCheckService);
		
		
		User user1=new User(1,"Taha","Dursun","dursuntaha08@gmail.com","123456","Active");
		User user2=new User(2,"Engin","Demirog","engin@gmail.com","654321","Active");
		User user3=new User(3,"Alper","Kuyucu","alper@gmail.com","123123","Active");

		UserActivationDao userActivationDao = new HibernateUserActivationDao();
		UserActivationService userActivationService = new UserActivationManager(userService,userActivationDao);
		//Register
		AuthCheckSerice authCheckService = new AuthCheckManager(userService);
		BaseSignUpManager baseSignUpManager = new SignUpManager(userService);
		AuthService authService1 = new AuthManager(baseSignUpManager,authCheckService,userActivationService);
		authService1.register(user1);
		authService1.register(user2);

		//ListAll
		List<User> users = userService.getAll();
		for (User user : users) {
			System.out.println(user.getFirstName());
		}
		
		//Login
		authService1.login("dursuntaha08@gmail.com", "123456");
		authService1.login("engin@gmail.com", "654321");
		
		//RegisterWithGoogle
		AuthService authService2 = new AuthManager(new GoogleSignManagerAdapter(userService) ,authCheckService,userActivationService);
		authService2.register(user3);
		
		
	}

}
