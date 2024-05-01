import java.util.Scanner;

public class AuthoringAssistant {
   
	
	public static void printMenu()
	{
	System.out.println("MENU");
	System.out.println("c - Number of non-whitespace characters");
	System.out.println("w - Number of words");
	System.out.println("f - Find Word");
	System.out.println("r - Replace all !'s");
	System.out.println("s - Shorten spaces");
	System.out.println("q - Quit");
	}
	
	
	public static void executeMenu(char usrOption, String userInput, Scanner scnr)
	{

	}
	
	public static int getNumOfNonWSCharacters(String userInput)
	{
		int length = userInput.replace(" ","").length();
		return length;
	}
	
	public static int getNumOfWords(String userInput)
	{
		if (userInput == null || userInput.isEmpty()) { 
			return 0; } 
		String[] words = userInput.split("\\s+"); 
		return words.length;
	}
	
	public static String replaceExclamation(String userInput)
	{
		return userInput.replace('!', '.');
	}
	
	public static int findText (String userWord, String userInput)
	{
		String a[] = userInput.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
		if (userWord.equals(a[i]))
		count++;
		}
		return count;
	}
	
	public static String shortenSpace(String userInput)
	{
		return userInput.replaceAll("\\s+"," ");
	}
	
	
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput = scnr.nextLine();
      char choice = scnr.next().charAt(0);
     
      System.out.println("Enter a sample text:");   
      System.out.println();
      System.out.println("You entered: " + userInput);
      
    
      if (choice == 'c') //Works
		 {
			System.out.println("Number of non-whitespace characters: " + getNumOfNonWSCharacters(userInput));
			System.out.println();
			printMenu();
			System.out.println();
			System.out.println("Choose an option:");
		 }
		
		
      else if (choice == 'w') //Works
		 {
			 System.out.println("Number of words: " + getNumOfWords(userInput));
			 System.out.println();
			 printMenu();
			 System.out.println();
			 System.out.println("Choose an option:");
		 }
		
      else if (choice == 'f')//This works but rework findText
		 {
    	  	scnr.nextLine();
    	  	String userWord = scnr.nextLine();
    	  	
    	  	System.out.println("Enter a word or phrase to be found:");
			System.out.println(("\"") + userWord + ("\"") + " instances: " + findText(userWord,userInput));
			printMenu();
			
			System.out.println(userWord);
			System.out.println();
			System.out.println("Choose an option:");
		 }
			 
		 
		
      else if (choice == 'r')//Works
		 {
			 
			 System.out.println("Edited text: " + replaceExclamation(userInput));
			 System.out.println();
			 printMenu();
			 System.out.println();
			 System.out.println("Choose an option:");
		 }
		 
      else if (choice == 's')//Works
		 {
			 
			 System.out.println("Edited text: " + shortenSpace(userInput));
			 System.out.println();
			 printMenu();
			 System.out.println();
			 System.out.println("Choose an option:");
		 }
		
      else if (choice == 'q')
      {
    	  System.out.println();
    	  printMenu();
    	  System.out.println();
    	  System.out.println("Choose an option:");
    	  
 
      }
      
    
  
      
   }
}

