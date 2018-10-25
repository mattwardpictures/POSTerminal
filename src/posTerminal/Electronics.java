package posTerminal;

public class Electronics extends Products {

	private String processor; 
	private int memory;

	public Electronics() {

	}

	public Electronics(String make, String category, String name, double price) {
		super(make, category, name, price);

	}

	public Electronics(String processor, int memory) {
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

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
