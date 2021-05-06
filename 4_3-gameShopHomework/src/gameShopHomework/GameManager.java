package gameShopHomework;

public class GameManager extends ProductManager {
	
	@Override
	public void register(Product product) {
		super.register(product);
	}

	@Override
	public void update(Product product) {
		super.update(product);
	}

	@Override
	public void delete(Product product) {
		super.delete(product);
	}

	@Override
	public void addBulk(Product[] product) {
		for (Product prd : product) {
			this.register(prd);	
		}
	}
}
