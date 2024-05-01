import java.util.Scanner;

public class Test {
		public static void main(String[] args) {

//Comments can be used in a piece of code and the program will ignored it 
// Anything after (//) can be used to comment and it will be ignored 
//Single line comments use (//)
/*Can be used as a multiline comment
 * Asterisk after mean more line comment
 * Anything a certain color means comments
 * Can be changed depending on user settings
 *  Asterisk / ends the lines
 *  Remember Comments always have (//)
 */
//Statement- Programming Command that tells the program to do something
//Usually Commands will end in a semicolon ; 
	//System.out.print() = Prints the string inside the paratheses to console
System.out.println("a");

System.out.println("Hello World");

System.out.println("Yeet");

System.out.println("Aw Mustard");

System.out.println("Come on Man");

System.out.println("Sheeeeeesh");

//Naming Conventions
//Descriptive names

//z=(x*y) /2 ;
//a=(h*b) / 2;

//area=(height*base) / 2;

//Handling multiple words
//underscore_separated 
//camelCaseExample
//PascalCase=Classes, Methods
//not recommended to just smash things together
//With Companies stay with their same style. Makes it easier when working on a whole project


//TestClass 



	
		

//System.print()=The string will be printed on the current line
//System.out.println()=The next string printed will be a new line

//String=Collection of Characters 
//A Character is a single symbol (Letters,numbers,special characters)

//String Literal put it between double quotes "

//"" means not to try to treat the text as code

//Escape Character \
//Syntax Error
//Compile Time Error 

//Logic Error-Human Error
//Program doesn't crash-but doesn't do whats expected
//RunTime Error- Program Crashes at 'runtime'

// Identifiers are names given to variables and other items. Must follow certain rules:
//Contains letters, underscores, dollar signs, and digits(0-9)
//Must start with a letter, underscore, or dollar sign
//Is case sensitive
//Must not contain a keyword

//Type = Determines what data the variable can hold
//Size and what operations can be performed

//Primitive data types
//Build into java
// Includes byte,short,int,long,float,double,boolean,char

//Numbers
//Integer or a rational number
//Integer = negative or positive non-decimal number 
//Rational Number=negative or positive decimal number
//type identifier = value;
//int a = 150;
//Rational = float, double
//BigDecimal for currency

//Boolean Type= Can be either true or false

boolean p = true;
	
//Char type = a single unicode character 
char c = '!';

//String types =  Not a primitive, but java treats it like one 

String d = "Hello World";

//Declaration
//Variable must be declared before used
//Called Declaration
//type identifier;
//int principlePrice;

int g;

//int 1a; //invalid identifier
//sometime a;// Invalid type
//INT a; // Invaid type

//int a; // Redeclaration - Invalid
//string a; 
String l;

//System.out.println(c);
//int c;
//System.out.println(b);//Not initialized

//Declared but not initialized
String o;

//Initialization - the first time we assign a value to a variable
// = assignment operator
String b;

b = "Hello World"; 
b = "Test";

System.out.println(b);

//Declaration and Initialization
String q = "Initialized right away";

//Expressions 

//A= b * h

//int A =1;
//int b = 2;
//int h = 3;
//A = b * h;
//System.out.println(A)

// * / + -
// % - modulus, mod = remainer in division

int count = 20;
count = count + 1;

System.out.println(count);

//count--; Decrement

//Constant - Put final in front of varible. Will be varible constant

final float PI = 3.141f; 


// A = PI *r^2
//Math.pow(x,y) = x^y


//Scanner input; -declares a variable

Scanner scnr = new Scanner(System.in);

//Next[]// nextInt, nextline

//Best practice to prompt user when requesting input

System.out.println("Input a radius");

float radius = scnr.nextFloat();
float area= PI * radius * radius;
System.out.println(area);

// A = (b1+b2)/2*h
// Procedural rules: (Order of operations 
// ()
// */%
// +-
// left to right

// Wrong area
// float area = b1+b2/2*height

// expected result is 10
// b1 = 2 
// b2 = 3 
// h = 4 

// Actual = 8 

// Type Conversions
int u = 0;

float y = 0.0f;

 // Implicit conversion. Happens automatically
//float t = u * b;

//Explicit conversion. ALso called type castings
//int d= u * (int)b;

//A = b * h / 2
//int base = 3;
//int height = 3;
//float area = base * height / 2;
//System.out.println(area;









		}
}

