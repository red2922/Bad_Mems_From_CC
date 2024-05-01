import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      /* TODO: Declare any necessary variables here. */
      String fileName = "";
      
      /* TODO: Read a file name from the user and read the tsv file here. */
      fileName = scnr.nextLine();
      FileInputStream inStream = new FileInputStream(fileName);
      Scanner input = new Scanner(inStream);
      while(input.hasNextLine())
      {String line = inputnextLine();
      String[] pieces = line.split("\\t");
      String lastName = pieces[0];
      String firstName = pieces[1];
      String midterm1 = pieces [2];
      String midterm2 = pieces [3];
      String finalGrade = pieces [4];
      System.out.println(line);
      }
      
      /* TODO: Compute student grades and exam averages, then output results to a text file here. */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	procedure bubbleSort(A : list of sortable items)
    n := length(A)
    repeat
        swapped := false
        for i := 1 to n-1 inclusive do
            // if this pair is out of order 
            if A[i-1] > A[i] then
                // swap them and remember something changed 
                swap(A[i-1], A[i])
                swapped := true
            end if
        end for
    until not swapped
end procedure
	*/
	/*
	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void sortArray(int [] myArr, int arrSize)
	{
		int n = arrSize;
		boolean swapped;
		do
		{
			swapped = false;
			for(int i = 1; i <= n -1; i++)
			{
				if(myArr[i-1] > myArr[i])
				{
				swap(myArr, i - 1, i);
				swapped = true;
				}
			}
		}while(!swapped);
	
	}
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int size = input.nextInt();
	int[] array = new int[size];
	for(int i = 0; i < size; i++)
	{
	array[i] = input.nextInt();	
	}
	
	sortArray(array,size);
	
	for(int i = 0; i < size; i++)
	{
		System.out.print(array[i] + " ");
	}
	
	*/
/*
	public static int getMinimumInt(int[] listInts, int listSize) {
		   
		return 0;
	}
	
	public static void subtractValue(int [] array, int value)
	{
		for(int)
	}

		   public static void main(String[] args) {
		     Scanner scnr = new Scanner(System.in);
		     int numIntegers = scnr.nextInt();
		     int[] array = new int[numIntegers];
		     for(int i = 0; i < array.length; i++)
		     {
		    	 
		    	 array[i] = scnr.nextInt();
		    	 
		    	 
		     }
	   
		     int smallestValue = getMinimumInt(array, numIntegers);
		     subtractValue(array, smallestValue);
		     dispaly
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   /*
	      int userNum;
	      int i;
	      int j;

	      userNum = scnr.nextInt();

	       for(i = 0; i <= userNum; i++)
	       { for(j = 0; j < i; j++)
	          {System.out.print(" ");}
	       	System.out.println(i);}
	   
	   
	   /*
	 
	   
	   
	   /*
	   Scanner scnr = new Scanner(System.in);
     
     
     int[] userValues = new int[9];  // Set of data specified by the user      

     // Get input until we see a negative number
     
     int input= scnr.nextInt();
     int index = 0 ;
     while(input >= 0)
     {
    	 if(index >= 9)
    	 {System.out.println("Too many numbers");
    	 return;
    	 }
    	 
    	 userValues[index] = input;
    	 input = scnr.nextInt();
    	 index++;
    	 
     }
     
     int middleIndex = index / 2;
     System.out.println("Middle item: " + userValues[middleIndex]);
     */
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     /*
	   int changeAmount = input.nextInt();
	   
	   if(changeAmount == 0);
	   {
	   System.out.println("No change");
	   }
	   
	   
	   //need to convert change amount to coins
	   // Dollars = 100, Quarters , Dimes, Nickels , Pennies 
	   
	   int dollars = changeAmount / 100;
	   changeAmount = changeAmount % 100;
	   
	   int quarters = changeAmount / 25;
	   changeAmount = changeAmount % 25;
	   
	   int dimes = changeAmount / 10;
	   changeAmount = changeAmount % 10;
	   
	   int nickels = changeAmount / 5;
	   changeAmount = changeAmount % 5;
	   
	   int pennies = changeAmount;
	   
	   
	   
	   if(dollars > 1) {System.out.println(dollars + " Dollars"); }
	   else if(dollars == 1) {System.out.println(dollars + "Dollar"); }
		
	   if(dollars > 1) {System.out.println(quarters + " Quarters"); }
	   else if(dollars == 1) {System.out.println(quarters + "Quarter"); }
	   
	   if(dollars > 1) {System.out.println(dimes + " Dimes"); }
	   else if(dollars == 1) {System.out.println(dimes + "Dime"); }
	   
	   if(dollars > 1) {System.out.println(nickels + " Nickels"); }
	   else if(dollars == 1) {System.out.println(nickels + "Nickel"); }
	   
	   if(dollars > 1) {System.out.println(pennies + " Pennies"); }
	   else if(dollars == 1) {System.out.println(pennies + "Pennie"); }
	   */
	   
	   
   }
}

