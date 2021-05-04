package kodlamaIoOdev;

public class UserManager {
	private User user;
	
	public UserManager(User user) {
		this.user=user;
	}
	
	public void add() {
		System.out.println("Eklendi: " + user.getFirstName());
	}
	
	public void update() {
		System.out.println("Güncellendi: " + user.getFirstName());
	}
	
	public void delete() {
		System.out.println("Silindi: " + user.getFirstName());
	}
}
