package starbucksNeroDemo;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("TAHA ABDURRAHÝM");
		customer1.setLastName("DURSUN");
		customer1.setNationalId("25933212658");
		customer1.setDateOfBirth(new GregorianCalendar(1997,01,19).getTime());
		
		Customer customer2 = new Customer();
		customer2.setId(1);
		customer2.setFirstName("TAHA ABDURRAHÝM");
		customer2.setLastName("DURSUN");
		customer2.setNationalId("25933212658");
		customer2.setDateOfBirth(new GregorianCalendar(1997,01,19).getTime());
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.add(customer1);
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.add(customer2);
		
		

	}

}
