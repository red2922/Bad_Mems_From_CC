
import java.util.Scanner; 


public class Scanner_Assignments {
   public static void main(String[] args) {
	   
	   Scanner scnr = new Scanner(System.in);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
	   
	   
	   
	   /*
	    
	   //This program will store roster and rating information for a soccer team. Coaches rate players during tryouts to ensure a balanced team.

//(1) Prompt the user to input five pairs of numbers: A player's jersey number (0 - 99) and the player's rating (1 - 9). 
	   //Store the jersey numbers in one int array and the ratings in another int array. Output these arrays (i.e., output the roster). (3 pts)
	   
	   
//(2) Implement a menu of options for a user to modify the roster. Each option is represented by a single character. 
//The program initially outputs the menu, and outputs the menu after a user chooses an option. 
 //The program ends when the user chooses the option to Quit. 
//For this step, the other options do nothing. (2 pt)
	   
//(3) Implement the "Output roster" menu option. (1 pt)
	   
 //(4) Implement the "Update player rating" menu option. Prompt the user for a player's jersey number. 
//Prompt again for a new rating for the player, and then change that player's rating. (1 pt)
	   
 //(5) Implement the "Output players above a rating" menu option. Prompt the user for a rating. 
//Print the jersey number and rating for all players with ratings above the entered value. (2 pts)	   
	   
//(6) Implement the "Replace player" menu option. Prompt the user for the jersey number of the player to replace. 
//If the player is in the roster, then prompt again for a new jersey number and rating. 
//Update the replaced player's jersey number and rating. (2 pts)


	   
	   final int NUM_PLAYERS = 5;
	   
	   int [] playerJersey = new int[NUM_PLAYERS];
	   int [] playerRating = new int[NUM_PLAYERS];
	   int i;
	   char input;
	   
	   
	   for(i = 0; i < 5; i++) {
		   playerJersey[i] = scnr.nextInt();
		   playerRating[i] = scnr.nextInt();
		   System.out.println("Enter player " + (i + 1) + "'s jersey number:");
		   System.out.println("Enter player " + (i + 1) + "'s rating:");
		   System.out.println();
		  }
	   
	   System.out.println("ROSTER");
	   
	   for(i = 0; i < 5; i++) {
		   System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerJersey[i] + ", Rating: " + playerRating[i]);
		}
	   		System.out.println();
	   		
	   		System.out.println("MENU");
			   System.out.println("u - Update player rating");
			   System.out.println("a - Output players above a rating");
			   System.out.println("r - Replace player");
			   System.out.println("o - Output roster");
			   System.out.println("q - Quit");
			   System.out.println();
			   System.out.println("Choose an option:");
	   
			   input = scnr.next().charAt(0);
	   		
	   		if(input == 'q') {
	   			System.exit(0);
	   		}
	   		
	   		
	   		else if(input == 'u') {
	   			int jerseyNum = scnr.nextInt();
	   			int newRating = scnr.nextInt();
	   			if (jerseyNum == playerJersey[i]) {
	   				playerRating[i] = newRating;
	   			}
	 		   
	   		}
	   		
	    
	   		else if(input == 'a') {
	   			int rating = scnr.nextInt();
		 		   do {System.out.println(playerRating[i]);}
		 			  while (playerRating[i] > rating);
	   		}
	   		
	   		
	   		else if(input == 'r') {
	   			int jerseyNum = scnr.nextInt();
	   			int newJersey = scnr.nextInt();
	   			if(jerseyNum == playerJersey[i])
	   			{
	   				playerJersey[i] = newJersey;
	   			}
	   		}
	   		
	   		
	   		else if(input == 'o') {
	   		 System.out.println("ROSTER");
	   		 for(i = 0; i < 5; i++) {
	  		   System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerJersey[i] + ", Rating: " + playerRating[i]);
	   		}
	   
	   */
	   
	   		
   
	   
	   
	
		   
	   




	   /*
	   final int NUM_GUESSES = 3;
	      int[] userGuesses = new int[NUM_GUESSES];
	      int i;

	      NUM_GUESSES = scnr.nextInt();
	      for(i = 0; i < userGuesses.length;i++) {
	    	  
	    	  
	    	  
	    	  
	      }
	    	  
	    	  

	      for (i = 0; i < userGuesses.length; ++i){
	         System.out.print(userGuesses[i] + " ");
	      }
	   }
	}
	*/
	 /*
	   String userInput = scnr.nextLine();
	      
	   int BFF;
	   int IDK;
	   int JK;
	   int TMI;
	   int TTYL;
	   
	   System.out.println("Enter text:");
       System.out.println("You entered: " + userInput);
       System.out.println();
       
       	BFF = userInput.indexOf("BFF");
       	if  (BFF == -1) 
       	{}
       	else
       	{System.out.println("Replaced \"BFF\" with \"best friend forever\".");}
       	
       	
       	IDK = userInput.indexOf("IDK");
		if  (IDK == -1) 
   		{}
		else 
		{System.out.println("Replaced \"IDK\" with \"I don't know\".");}
		
		
	    JK = userInput.indexOf("JK");
		if  (JK == -1) 
   		{}
		else
		{System.out.println("Replaced \"JK\" with \"just kidding\".");}
	    
	    
	    TMI = userInput.indexOf("TMI");
		if  (TMI == -1) 
   		{}
		else
		{System.out.println("Replaced \"TMI\" with \"too much information\".");}
	    
		
	    TTYL = userInput.indexOf("TTYL");
		if  (TTYL == -1) 
   		{}
		else
		{System.out.println("Replaced \"TTYL\" with \"talk to you later\".");}
	      
		
		
		
		userInput = userInput.replace("BFF", "best friend forever");
		userInput = userInput.replace("IDK", "I don't know");
		userInput = userInput.replace("JK", "just kidding");
		userInput = userInput.replace("TMI", "too much information");
		userInput = userInput.replace("TTYL", "talk to you later");
	      
	    System.out.println();
	    System.out.println("Expanded: " + userInput);
	      */
	      
	      
	  
	      

	     
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   /*
	   
	   String userString;
	      

	      userString = scnr.next();
	     boolean isInteger = true;
	     int count = 0;
	     
	     for(int i = 0; i < userString.length(); i++)
	     {
	    	 //Tells us if a single character is a digit or not
	    	if(!Character.isDigit(userString.charAt(i))) {isInteger = false;}
	    	 
	     }
	     
	     isInteger = count == userString.length();
	     
	     if(isInteger) {System.out.println("Yes");}
	     else {System.out.println("No");}
	   */
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 
	   
	   
	   
	   
	   /*
	   char inChar = scnr.next().charAt(0);
	   String inString = scnr.nextLine();
	   int count = 0;
	   
	   for(int i = 0; i< inString.length(); i++)
	   {
		   char c = inString.charAt(i);
		   if (c == inChar) {count++;}
	   }
		   
	   if(count != 1)
	   {
	   System.out.println(count + " " + inChar + "'s");
	  
	   }
	   else
	   {
		   System.out.println(count + " " + inChar);
	   }
	   */
	   
	   
	   
	   
	   
	   
	  
	   
	   
	   
	   
	   
	   /*    String word = "";
	      int number = 0;
	      
	      
	   
	      
	      
	      while(!word.equals("quit"))
	      {
	    	  System.out.println("Eating " + number + " " + word + " a day keeps you happy and healthy." );
	    	  word = scnr.next();
	    	  number = scnr.nextInt();
	      }
	     */
	   /*
	   int maxNumber = 0;
	   int averageNumber = 0;
	   int userNum = 0; 
	   int sum = 0;
	   int count = 0;
	   
	   while (userNum > -1)
	   {
		userNum = scnr.nextInt();   
		sum = sum + userNum;
		count = count + 1; 
		maxNumber = Math.max(maxNumber, userNum);
	   }
	   
	   averageNumber = sum / count;
	   System.out.println(maxNumber + " " + averageNumber);
	   
	   
	   */
	   
	   
	   
	   /*
	   
	   
	   
	   
}

private static int length(String userInput) {
	// TODO Auto-generated method stub
	return 0;
}
   }


//While, do while , for ,for each -----Loops
// keep looping
//word.indexof("quit") < 0 // quit
//!word.equal("quit")
*/