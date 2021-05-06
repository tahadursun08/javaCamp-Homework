package gameShopHomework;

public abstract class ProductManager implements ProductService {
	
	@Override
	public void register(Product product) {
		System.out.println(product.getName()+" : Eklendi");
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName()+" : G�ncellendi");
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName()+" : Silindi");
	}

	@Override
	public void addBulk(Product[] product) {
		for (Product prd : product) {
			this.register(prd);	
		}
	}

}
