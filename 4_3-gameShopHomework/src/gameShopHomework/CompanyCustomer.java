package gameShopHomework;

public class CompanyCustomer extends Customer {
	private String companyName;
	private String faxNumber;
	
	public CompanyCustomer() {
		
	}
	
	public CompanyCustomer(String companyName, String faxNumber) {
		super();
		this.companyName = companyName;
		this.faxNumber = faxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
}
