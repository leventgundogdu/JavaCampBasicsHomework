package classesWIthAttributes;

public class ProductManager {

	public void Add(Product product) {
		// JDBC
		System.out.println("Urun eklendi: " + product.getName());
	}

	public void Add2(int id, String name, String description, double price, int stockAmount, String renk) {

	}

}
