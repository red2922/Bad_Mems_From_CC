import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer_2 {
	
	public static int findText (String userWord, String inputData)
	{
		String a[] = inputData.split("");
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
		if (userWord.equals(a[i]))
		count++;
		}
		return count;
	}

	
	public static boolean hasNum(String newString)
	{
	    for (int i=0; i != newString.length(); i++)
	    {
	        if (Character.isDigit(newString.charAt(i))) 
	        {
	            return true;
	        }
	    }
	    return false;
	    
	}
	
	public static void cToA (ArrayList newArray)
	{
		
	for(int f = 0; f < newArray.size(); f++)
	{
	int numAsterisk = 1 * newArray[f];
	
	
	
	
	}
	
	}
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
     
      boolean Keepgoing = true;
      
      
      ArrayList<String> myInputs = new ArrayList<String>();  
      ArrayList<String> myNumbers = new ArrayList<String>();
      
      System.out.println("Enter a title for the data:");
      String inputTitle = scnr.nextLine();
      System.out.println("You entered: " + inputTitle);
     
      System.out.println();
      System.out.println("Enter the column 1 header:");
      String inputColumnOne = scnr.nextLine();
      System.out.println("You entered: " + inputColumnOne);
      
      System.out.println();
      System.out.println("Enter the column 2 header:");
      String inputColumnTwo = scnr.nextLine();
      System.out.println("You entered: " + inputColumnTwo);
      
    
      
      do {
          System.out.println();
          System.out.println("Enter a data point (-1 to stop input):");
          
          String inputData = scnr.nextLine();
         
          if(inputData.contains("-1"))
        {
        	  Keepgoing = false;
        	break;
        }
          
          if (!inputData.contains(",")) {
        	  
        	  System.out.println("Error: No comma in string.");
          }
          
          if(findText(",", inputData) > 1) {
        	  
        	  System.out.println("Error: Too many commas in input.");
          }
          
           if(hasNum(inputData) == false) {
          System.out.println("Error: Comma not followed by an integer.");
          }
         
           else if (findText(",", inputData) == 1) {
          
         String parts[] = inputData.split(",");
         
         myInputs.add(parts[0]);
         myNumbers.add(parts[1]);
         
          System.out.println("Data string: " + parts[0]);
          System.out.println("Data integer: " + parts[1]);
          }
          
          
      }
          while(Keepgoing == true);
        
      System.out.println();
      System.out.printf("%33s\n",inputTitle);
      System.out.printf("%-20s|%23s\n",inputColumnOne, inputColumnTwo);
      System.out.printf("--------------------------------------------\n");
      
      for(int j = 0;j < myInputs.size();j++)
      {
      System.out.printf("%-20s|%23s\n", myInputs.get(j), myNumbers.get(j));
    	  
      }
      
      System.out.println();
      
      for(int j = 0;j < myInputs.size();j++)
      {
      System.out.printf("%20s %23s\n", myInputs.get(j), myNumbers.get(j));
    	  
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
}
