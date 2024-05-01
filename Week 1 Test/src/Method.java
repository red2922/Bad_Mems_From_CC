import java.util.Scanner;
public class Method {

	
	
	
	//Single responsibility principle
	//Every module,class, or function should have responsibility over one thing
	
	
	
	//There should only be one scanner per input stream
	//Only use one scanner 
	//Scanner would only go into the main method 
	
	//Methods should allow you to write code easier 
	
	//Method overloading
	//Method signature
	//returnType methodName(paramTypes);
	
	//Try to name methods different names 
	//Two or more methods with same name but different parameter types
	//(or number)
	
	public static void example(int a) { }
	public static void example(boolean b) { } 
	
	public static void displayArray(int[] input)
	{
		for(int i =0; i < input.length; i++)
		{
			System.out.println(input[i]);
		}
		
	}
	
	
	// Polymorphism 
	
	
	
	
	
	public static void example(int a, String b) {}
	
	public static void primitiveInput (int input)
	{
		//input is a pass by value 
		input = 1; //input is a copy so changing it doesn't change outside
		System.out.println(input);
	
	}
	
	public static void referenceInput(int[] input)
	{
		input[1] = 99;
		input = new int[4];
		input[0] = 11;
		input[1] = 22;
		input[2] = 33;
		input[3] = 33;
	}
	
	
public static void main(String[] args) {
		int a = 0;
		primitiveInput(a);
		
		int[] example = new int [3];
		example[0] = 1;
		example [1] = 2;
		example [2] = 3;
		referenceInput(example);
		for(int i = 0; i < example.length; i++)
		{
}
	
	
	
//public class Method {
	
	
	//Class Scope
	//Member variables
	/*
	public static int mA=0;
	
	
	public static void methodName()
	{
		mA++;
	}
	
	
	
	//Side Effects
	//A function does something other than return a value
	//f(x) = a, takes input and it generate output
	
	//Method allow us to create a section of code that can be reusable 
			//[access-specifier] (static) [returnType] [methodName]
			//methodName = identifier, follows identifier rules
			
			//must be defined in the "class" area, block 
			//Cannot be in another method 
	
			//Parameter is an input to a method. A method can hav emultiple parameters
			//They are separated by commas 
	public static void methodWithSingleParameter(int name)
	{
		System.out.println(name);
	}
	
	public static void methodMultipleParams(String a, int b, char d)
	{
		System.out.println(a + " " + b + " " + d);
	
	}
	
	public static void noReturnType(int input)
	{
		if(input == 1)
		{
			return;
		}
		System.out.println("After the return");
	}

	
	//Any datatype can be used
	//Must use a return statement - on every control path
	//Only return one value 
	public static int methodReturnType(String input)
	{
		return input.length();
		//Immediately stops = anything after a return is ignored 
	}
	
	
	
	public static void main(String[] args) {  //Where the code will actually run globally 
		System.out.println(methodReturnType("test") + 1);
		//Arguments are a value provided to a method parameter during its call
		methodWithSingleParameter(1);
		methodMultipleParams("Hello", 5, 'e'); // Must pick something for each parameter or it will not compile 
		
	noReturnType(1);
	System.out.println("main");
	
	methodReturnType("Testing");

		
		
	//Invoke, Call, Execute 
		mA = 1;
		methodName();
		System.out.println(mA);
		
	// DRY = Don't repeat yourself
	
	// Calculate sum
		
		/*int sum = 0;
		int [] array = {50,75,80};
		
		for(int i = 1; i< array.length; i++)
		{
			sum += array[i];
		}
	*/
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
	
	
	
	
