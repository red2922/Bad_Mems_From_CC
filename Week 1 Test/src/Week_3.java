import java.math.BigDecimal;
import java.util.Scanner;
public class Week_3 {
	public static void main(String[] args) {

		System.out.println("Yeet 8/31/2021");
		
		System.out.println("Type Conversion and Casting");
		//Cannot Divide by Zero
		System.out.println(90/30);
		
		int a = 70;
		int b = 35;
		
		System.out.println(a/b);
		
	
		
	//	System.out.println("Enter a Number");
	//	int d = in.nextInt();
		
	//System.out.println(70/d);
	
	//CANNOT DIVIDE BY ZERO
	
		//Floats dont't error out
		
		System.out.println(1.0/0);
		
	
		//String concatenation 
		//Concat (Basically String Addition)
		String n1 = "1";
		String n2 = "2";
		String n3 = n1 + n2; 
		System.out.println(n3);
		
		//ALWAYS USE PEMDAS FOR EVERYTHING
		System.out.println("Test " + 1); //"Test" + "1" = "Test1"
		System.out.println("Test " + 1 + 2); // Becomes "Test12" Due to order of operations
		System.out.println("Test " + (1+2));

		//Relational operators
		// > Greater than
		// < Less than
		// >= Greater than or Equal to
		// <= Less than or Equal to 
		
		int age = 18;
		
		// Read as canDrive assigned if age is greater than or equal to 16
		boolean canDrive = age >= 16;
		System.out.println("Can Drive: " + canDrive);
		
		//Compare to another variable
		int DrivingAge = 16; 
		canDrive = age >= DrivingAge;
		
		System.out.println("Can Drive: " + canDrive);		
		
		
		//Order Matters with this has to go >= or <=    not => or =<
		
		//Assignment Operator 
		//Variable Assignment
		
		//int a = 1 -> a is assigned to value 1
		//Left side is the variable to assign to 
		//Right side is a value or variable to assign 
		
		//Primitive is fast but Reference types are large enough that we don't want to pass it around
		
		//Points/Reference is where the code is held (In the Heap) and it is where it is referenced use a code: 
		//0x01
		
		//Equality Operator
		// == Equality Operator-Checks if 2 values are equal 
		
		//Don't Mistake for assignment = 
		
		System.out.println(a == 2); 
		
		// Yoda conditions 
		// a ==2, 2 == a 
		System.out.println(2 == a);
		
		//Physical equality 
		//Physical equality means are we the same object, or does our memory match\
		
		//Example 1 
		String c = "test";
		String d = "test";
		System.out.println("Example 1: " + (c == d));
		
		//Example 2 
		String e = "test";
		String f = "te";
		String g = "st";
		String h = f +g;
		System.out.println("Example 3: " + (e == h));
		
		//Example 4
		
	//	Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input");
		//String in = input.nextLine();
		//System.out.println("Example 4: " + (in == e));
		
		//Variable.equals(compareTo);
		System.out.println("Example 5: " + e.equals(h));
		
	//Literal 
		System.out.println("Example 7: " + "test".equals(e));
		
	//Floating numbers
		
		//floats and double are floating point
		double o = 2.0;
		double p = 4.0;
		
	System.out.println(( o + p ));
		
		//We don't use == equality on floats
	
		//See if the absolute distance between the values is close enough
		
		//ApproximatelyEqual
		//|a-b| < epsilon
		//epsilon is a very small value 0.0001 
		
		double j = .01;
		double k = .02;
		boolean isApproxEqual = Math.abs((j+k) -.03) < 0.0001;
		
		System.out.println(isApproxEqual);
		
		// NULL = nothing. null does not equal zero. null means nothing
		// A null string
		
		String nullString = null;
		//String notTheSame = "null"; 
		
		// object.method means perform method on the object 
		//nullString.equals(null); 
		
		//Empty String is not equal to a null string
		String emptyString = "";
		System.out.println("Is String Empty: " + "".equals(nullString));
		System.out.println("Is String the world 'nul''" + "null".equals(nullString));
		
		System.out.println("Is String Null: " + (null == nullString));
		
		//Primitives cannot be null
		
		
		//Every primitive has a reference type that can be used
		
		Integer refInt = null;
		
		// Branches 
		//A branch allows code to do different things based on a condition (boolean)
		
		// If/Else
		
		boolean condition = true;
		boolean condition2 = true;
		
		System.out.println("Before branch");
		if(condition) // can put a condition where condition is ex. a<b where condition is  ect.. 
		{
			System.out.println("True Statement");
			//Common practice indent when using a branch
			//Nesting - putting code within code 
			//ElseIf, after if but before else
		}
		else if(condition2) // Only occurs if condition 1 is false 
		{
			
		}
		else // Only occurs when everything else is false 
		{
			//None of the other conditions were true 
			System.out.println("False Statement");
		}

	
		int numSales = 0;
		int salesBonus = 0;
		int totBonus = 0;
		if(numSales < 20)
		{
			salesBonus = 0;
		}
		else 
		{
			totBonus = totBonus + 1;
			salesBonus = 20;
		}
		System.out.println(salesBonus);
		
		
		
		
		
		
		
		
		
		
		}
}
