package posTerminal;

public class Computer extends Electronics {

	private double storage;

	public Computer() {

	}

	public Computer(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public Computer(String processor, int memory) {
		super(processor, memory);

	}

	public Computer(double storage) {
		super();
		this.storage = storage;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return super.toString()+ String.format("%-15s", storage + "GB");
	}

}
