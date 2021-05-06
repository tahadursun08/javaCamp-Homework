package gameShopHomework;

import java.util.Date;

public class Order {
	private int id;
	private int customerId;
	private int productId;
	private double unitPrice;
	private int campaignId;
	private double discountedPrice;
	private Date date;
	
	public Order(int id, int customerId, int productId, double unitPrice, Date date,int campaignId, double discountedPrice) {
		this.id = id;
		this.customerId = customerId;
		this.productId = productId;
		this.unitPrice = unitPrice;
		this.date = date;
		this.campaignId = campaignId;
		this.discountedPrice = discountedPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	
}
