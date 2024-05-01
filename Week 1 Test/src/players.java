
public class players {
//Encapsulation
	
//Abstraction
	
//public static void methodName(){}
	//public = access specifier
	//public = visible to all code
	
	//private = variable or method is visible only to the same class
	//Written like private int = 0;
	
	//protected
	//Static variable are all public 
	
	//Fields - variables that in a class. At class scope 
	int JerseyNumber = 0;
	int Rating = 0;
	
	public players() 
	{
	
	}
	
	private int Index = 0;
	//Mutators and Accessors.Propeties
	//Getters and Setters
	public int GetIndex() {return Index;}
	
	//Constructor
	//Every class has an invisible default constructor by default
	//Unless we provide a constructor
	
	//Parameterized constructor 
	public players(int index)
	{
		System.out.println("Constructor");
	}
	
	
	
}
