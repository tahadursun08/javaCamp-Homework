package gameShopHomework;

import java.util.Date;

public class OrderManager implements OrderService {
	private CustomerService customerService;
	private CampaignService campaignService;

	
	public OrderManager(CustomerService customerService,CampaignService campaignService) {
		this.customerService = customerService;
		this.campaignService = campaignService;

	}
	@Override
	public void add(Order order) {
		
		System.out.println("Sipariþ eklendi.");
		System.out.println("*Order Id: " + order.getId());
		System.out.println("*Order Date: " + order.getDate());
		System.out.println("*Order Customer Id: " + order.getCustomerId());
		System.out.println("*Order Product Id: " + order.getProductId());
		System.out.println("*Order Price: " + order.getUnitPrice() + " TL");
		System.out.println("*Price After Discount: " + order.getDiscountedPrice() + " TL");

	}

}
