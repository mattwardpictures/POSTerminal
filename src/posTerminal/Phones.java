package posTerminal;

public class Phones extends Electronics {
	private double displaySize;
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public Phones() {

	}

	public Phones(String make, String category, String name, double price) {
		super(make, category, name, price);

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
		return super.toString() +String.format("%-15s %-15s", displaySize + "\" ", memory + "GB");
	}

}
