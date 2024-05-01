
public class Assets {
	
	protected int boughtPrice;
	protected int currentPrice;
	protected String Symbol;
	
	public void Asset(String SYBL, int bPrice, int cPrice) {
	Symbol = SYBL;
	boughtPrice = bPrice;
	currentPrice = cPrice;
	
	}
	
	public String getSYBL() {
		return Symbol;
	}
	

	public int getbPrice() {
		return boughtPrice;
	}
	
	public int getcPrice() {
		return currentPrice;
	}
	
	
	
}
