import java.util.Scanner; 

public class Week_4 {
	public static void main(String[] args) {
		
		
		//Branching--> if statements
		/*
		//Switch statement = compare one variable to many different constants for equality
		
		int mode = 1;
		if(mode == 1) {System.out.println("ModeA");}
		if(mode == 2) {System.out.println("ModeB");}
		
		//Both of these do the same thing. Just written different 
		
		switch(mode)
		{
		case 1:
			System.out.println("ModeA");
		case 2: 
			System.out.println("ModeA");
		default:
			break;
		*/
		//Loops= Change what code is being used at certain times
			//Logical operators allows boolean values to be combined
			
			// ! = Not
			// && = And
			// || = or
			
			//Usually used with >< 
			
			//AND both must be true
			// or one side must be true 
		
			
			//If example is null - it is not equal to "test"
			//If example is not null - it might be equal to "test" 
		// Should do boolean isEqual = (null != reference) && (reference.equals("value")); 
		
		//Loop
		//Executes the statements inside it (body of the loop)
		//as long as the condition of the loop is true 
			
		//Each time a loop is executed - we can call it an iteration
			
		//While Loop
		/*
		boolean condition = true; 
		while (condition)
		{
			//The execution of an iteration
			//continues untill the end of the body, even if the condition
			//changes middway 
			System.out.println("Loop body");
		}
		System.out.println("After loop");
		condition = true;
		*/
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int d = in.nextInt();
		
		while(d == 0)
		{
			System.out.println("Zero not valid, please enter a non zero number.");
		}
		
		System.out.println(1 / d);
		*/
		/*
		Scanner in = new Scanner(System.in);
		
		int d = 0;
		do 
		{
			//Loop body
			System.out.println("Please enter a non-zero number.");
			d= in.nextInt();
		}while (d == 0); // if true then goes to the body. If false goes to the next line 
		 */
		/*
		int num = 1; 
		while(num <= 100)
		{
			System.out.println(num);
			num++;
		}
		
		*/
		/*
		for (int num = 100; num >= 1; num /= 2)
		{
			System.out.println(num);
		}
		*/
		
		//Nest
		/*
		final int width = 3;
		final int height = 4;
		for(int y =0; y < height; y++)
		{ 
			for(int x = 0; x < width; x++)
			{
				if(x % 2 == 0) {System.out.print("o");
			}
				else {System.out.print("x");}
			
			}
		System.out.println();
		
		*/
		boolean condition = true;
		while (condition)
		{
			System.out.println("A");
			//continue; // Immediately skip to condition check
			break; //Immediately exits the while 
		}
		System.out.println("End"); 
		
		//Scope 
		// A variable is only valid for the scope it is declared
		//There is a new scope at every bracket {}
		// Variable is visible to their current scope and any scope "below" them 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
			}
		
		
		
		}
		
		
		
				
		
		
		
	
		
		
		
		
		
		
		
		
	

