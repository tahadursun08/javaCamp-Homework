package kodlamaIoOdev;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String pitcure;
	private String age;
	
	public void add(String message) {
		System.out.println("Default User: "+ message);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPitcure() {
		return pitcure;
	}

	public void setPitcure(String pitcure) {
		this.pitcure = pitcure;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
