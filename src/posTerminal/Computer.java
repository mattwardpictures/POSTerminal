package posTerminal;

public class Computer extends Products {
	private String cpuInfo, gpuInfo;
	private int memory;
	private double storage;

	public Computer() {

	}

	public Computer(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public Computer(String cpuInfo, String gpuInfo, int memory, double storage) {
		super();
		this.gpuInfo = gpuInfo;
		this.cpuInfo = cpuInfo;
		this.memory = memory;
		this.storage = storage;
	}

	public String getGpuInfo() {
		return gpuInfo;
	}

	public void setGpuInfo(String gpuInfo) {
		this.gpuInfo = gpuInfo;
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

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-25s %-35s %-25s %-15s", "CPU: " + cpuInfo, "GPU: " + gpuInfo,
				"Memory: " + memory + "GB RAM", "Storage: " + storage + "TB");
	}

}
