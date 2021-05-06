package gameShopHomework;

public class Product {
	private int id;
	private String name;
	private String description;
	private Double sellingPrice;
	
	public Product(int id, String name, String description, Double sellingPrice) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.sellingPrice = sellingPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

}
