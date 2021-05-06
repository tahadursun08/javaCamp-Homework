package gameShopHomework;

public interface ProductService {
	void register(Product product);
	void update(Product product);
	void delete(Product product);
	void addBulk(Product[] product);
}
