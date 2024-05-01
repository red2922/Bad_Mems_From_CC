import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
     
      
      int i = 0;
      
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
      Scanner dataOverISS = null;
      
      String firstData;
      String lastData;
      int dataInt;
      
      
      dataOverISS = new Scanner(inputData);
      
      
      firstData = dataOverISS.next();
      lastData = dataOverISS.next();
    
      System.out.println("Data string: " + firstData + " " + lastData);
      System.out.println("Data integer: " + lastData);
     
 
      int inputNum = scnr.nextInt();
      
      if(inputNum != -1)
      {
    	  i++;
      }
     }while (i == 0);
      
      
      
      
      
      
   }
}

