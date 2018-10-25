package posTerminal;

public class TVSets extends Electronics {

	private int displaySize, resolution;

	public TVSets() {

	}

	public TVSets(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public TVSets(String processor, String memory) {
		super(processor, memory);

	}

	public TVSets(int displaySize, int resolution) {
		super();
		this.displaySize = displaySize;
		this.resolution = resolution;
	}

	public int getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return displaySize + "\"" + resolution + "P";
	}

}
