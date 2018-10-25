package posTerminal;

public class Appliances extends Products {

	private double cubicFeet;

	public Appliances() {

	}

	public Appliances(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public Appliances(double cubicFeet) {
		super();
		this.cubicFeet = cubicFeet;
	}

	public double getCubicFeet() {
		return cubicFeet;
	}

	public void setCubicFeet(double cubicFeet) {
		this.cubicFeet = cubicFeet;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-15s", cubicFeet + "cuft.");
	}

}
