package posTerminal;

public class Products {

	public Products() {

	}

	private  String make;
	private String category;
	private  String name;
	private  double price;
	int x;

	public Products(String make, String category, String name, double price) {
		super();
		this.make = make;
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public  String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s ",make, category, name, "$" + price);
	}


}
