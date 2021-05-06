package gameShopHomework;

public class Customer {
	
	private int id;
	private String userCode;

	public Customer() {
		
	}

	public Customer(int id,String userCode) {
		this.id = id;
		this.userCode = userCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
}
