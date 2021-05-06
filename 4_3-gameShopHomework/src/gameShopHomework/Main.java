package gameShopHomework;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		
		//Costumer Register
		CustomerService customerService = new PersonCustomerManager(new EDevletServiceAdapter());
		
		Customer customer1 = new PersonCustomer(1,"abc1","TAHA ABDURRAHÝM","DURSUN","2131231231",
				new GregorianCalendar(1997,01,19).getTime(),"25");
		Customer customer2 = new PersonCustomer(2,"abc2","ALPER","KUYUCU","1895131513",
				new GregorianCalendar(1997,01,19).getTime(),"25");
		
		customerService.addBulk(new Customer[] {customer1,customer2});
		System.out.println("-------------------------------------------");
		
		//Product Register
		
		ProductService productService = new GameManager();
		
		Product product1 = new Game(1, "Leage Of Legends", "Strateji game",500.0);
		
		Product product2 = new Game(2, "Witcher", "Video game",1000.0);
		
		Product[] products = {product1,product2};
		
		productService.addBulk(products);
		
		System.out.println("-------------------------------------------");
		
		//Campaign Register
		
		CampaignService campaignService = new CampaignManager();
		Campaign campaign1=new Campaign(1,"abc-1", 20);
		campaignService.register(campaign1);
		
		//Order Register
		OrderService orderService = new OrderManager(customerService,campaignService);
		Order order1 = new Order(1,customer1.getId(),product1.getId(),product1.getSellingPrice(),new Date(),campaign1.getId(),480.0);
		orderService.add(order1);
		
		System.out.println("-------------------------------------------");

	}

}
