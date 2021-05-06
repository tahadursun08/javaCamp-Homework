package gameShopHomework;

public interface CustomerService {
	void register(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	void addBulk(Customer[] customer);
}
