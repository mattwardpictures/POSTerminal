package posTerminal;

public class Phones extends Electronics {
	private double displaySize;

	public Phones() {

	}

	public Phones(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public Phones(String processor, String memory) {
		super(processor, memory);

	}

	public Phones(double displaySize) {
		super();
		this.displaySize = displaySize;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	@Override
	public String toString() {
		return displaySize + "\"";
	}

}
