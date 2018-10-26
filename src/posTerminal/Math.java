package posTerminal;

public class Math {
	
	public static Double getTax(Double total) {
		
		return total * 0.06;
		
		
		
	}
	
	
	public static Double getGrandTotal(Double total) {
		
		return total * 1.06;
		
	}
	
	public static Double payCash(Double grandTotal, Double cash) {
		
		return cash - grandTotal;
		
	}
	
	public static Double giveChange(Double grandTotal, Double cash) {
		
		return cash - grandTotal;
	}
	


}
