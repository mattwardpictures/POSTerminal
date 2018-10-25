package posTerminal;

public class Electronics extends Products {

	private String processor, memory;

	public Electronics() {

	}

	public Electronics(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public Electronics(String processor, String memory) {
		super();
		this.processor = processor;
		this.memory = memory;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return processor + "GHz " + memory + "GB";
	}

}
