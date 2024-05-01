
public class Array {
	
	
	public static void depositMoney(int amount)
	{
		if(amount < 0) {return;}
	}
	
	public static int calculateSum(int[]input)
	{
		int sum = 0;
		for(int i = 0;i < input.length;i++)
		{
			sum += input[i];
		}
		return sum;
		}
	
	
	public static void main(String[] args) {
	
		int[] array = {50, 70 ,80};
		int sum = calculateSum(array);
		
		sum = calculateSum(array);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
