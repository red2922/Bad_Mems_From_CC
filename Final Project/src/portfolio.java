import java.util.ArrayList;

public class portfolio {
	protected ArrayList<portfolio> myPortfolio;
	private ArrayList<Assets> mAssets;
	ArrayList<Assets> getAssets() {return mAssets;}
	
	public void AddStock(Stock a) {
	
	mAssets.add(a);
	
	}

	public void DeleteStock(Stock a) {
		
		mAssets.remove(a);
	}

public void AddDividendStock(Dividend_Stock b) {
	
	mAssets.add(b);
}

public void DeleteDividendStock(Dividend_Stock b) {
	
	mAssets.remove(b);
}


public void AddMutual_Fund(Mutual_Fund c) {
	mAssets.add(c);
}

public void DeleteMutual_Fund(Mutual_Fund c) {
	mAssets.remove(c);
}



}
	
	
	
	
	
	
	
	
	
	
	
	

