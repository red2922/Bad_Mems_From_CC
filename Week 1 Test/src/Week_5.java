
public class Week_5 {
	public static void main(String[] args) {
		//A typical variable stores exactly one thing
		
		// Store the name of class members
		String name1 = "Jane Doe";
		String name2 = "Bob Doe";
		String name3 = "Matt Smith";
		String name4 = "Tyler Rose";
		
		//What if we wanted to add 5 more names??
		//This is where an array comes in 
		
		//An array contains a list of data
		
		//Each item in an array is called an 'element'
		//The number of array elements is called the arrays length
		
		//dataType [] arrayName = new dataType[numElements];
		//Create an array called classMembers that is 10 elements long
		//and containts String (each element is a String)
		String[] classMembers = new String[10];
		
		//An array elements are automatically initialized to default value 
		//NUmbers: Integers and Floats = 0
		//References: Null
		//Booleans: False
		//Strings: "" (Empty String)
		
		//Length of array is 3 
		//int[] example = {1,5,7};
	
		//Access by: arrayName[index]
		//index starts at 0 and counts up
		
		//int first = example [0];
		//int second = example [1];
		//int third = example [2];
		
		//System.out.println(third);
		
		
		//int fourth = example [3];
		//Last valid index is the length - 1
		//int error = example [-1];
		/*
		int aa = 0;
		int var = example[aa];
		int exp = example [aa + 1];
		int complex = example[aa * 2 + 1];
		*/
		/*
		int [] example = {1 ,5 ,7 ,9 ,10};
		example [0] = 2;
		example [3] = 5;
	
		int[] copy = new int[example.length];
		for(int i =0; i < example.length; i++)
		{
			copy[i] = example[i];
		}
		copy[0] = 4;
		
		
		for(int i = 0; i < example.length; i++)
		{
			System.out.println("Example: " + example[i] + " Copy: " + copy[i]);
		}
		
		
		*/
		/*
		int[] example = {1, 2, 3}; // Size 3 
		int[] resized = new int [example.length + 1];
		for(int i = 0; i < example.length; i++)
		{
			resized[i] = example[i];
		}
		example = resized; 
		
		//For-Each loop 
		//for(dataType identifier : arrayName)
		for(int e : example)
		{
			e = 1;
		}
		for (int e : example)
		{
		System.out.println(e);
		}
		*/
		
		// 2D 
		int[][] numVals = { 
				{22, 44, 66},
				{97, 98, 99}
		};
	
	System.out.println(numVals[1][2]);
	
	
	 //While, do while , for ,for each -----Loops
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
		
	}
	
	

