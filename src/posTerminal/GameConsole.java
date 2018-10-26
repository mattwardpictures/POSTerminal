package posTerminal;

public class GameConsole extends Products {
	private String gpuInfo, cpuInfo;
	private int resolution, memory, storage;

	public GameConsole() {

	}

	public GameConsole(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public GameConsole(String gpuInfo, String cpuInfo, int resolution, int memory, int storage) {
		super();
		this.gpuInfo = gpuInfo;
		this.cpuInfo = cpuInfo;
		this.resolution = resolution;
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

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-25s %-35s %-25s %-15s %-15s", "CPU: " + cpuInfo, "GPU: " + gpuInfo,
				"Resolution: " + resolution + "P", "Memory: " + memory + "GB RAM", "Storage: " + storage + "TB");
	}

}
