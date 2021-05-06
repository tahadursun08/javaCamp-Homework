package gameShopHomework;

import java.util.Date;

public class PersonCustomer extends Customer {
	
	public String firstName;
	public String lastName;
	public String identityNumber;
	public Date dateOfBirth;
	public String age;
	
	public PersonCustomer() {
		
	}
	
	public PersonCustomer(int id,String userCode,String firstName, String lastName, String identityNumber, Date dateOfBirth, String age) {
		super(id, userCode);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
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

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
