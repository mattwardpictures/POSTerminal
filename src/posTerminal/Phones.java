package posTerminal;

public class Phones extends Products {
	private String cpuInfo;
	private int memory;
	private double displaySize;

	public Phones() {

	}

	public Phones(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public Phones(String cpuInfo, int memory, double displaySize) {
		super();
		this.cpuInfo = cpuInfo;
		this.memory = memory;
		this.displaySize = displaySize;
	}

	public String getCpuInfo() {
		return cpuInfo;
	}

	public void setCpuInfo(String cpuInfo) {
		this.cpuInfo = cpuInfo;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-25s %-35s %-25s", "Screen Size: " + displaySize + "\"",
				"CPU: " + cpuInfo, "Memory: " + memory + "GB");
	}

}
