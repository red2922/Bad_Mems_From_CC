
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class loading_saving_portfolio {

	
	public static void main(String[] args) throws FileNotFoundException {
	
		int i = 0;
		Scanner scnr = new Scanner(System.in);
		String userInput = scnr.nextLine();
		
		
		 File file = new File(userInput + ".txt");
		 
		 Scanner F = new Scanner(file);
		 System.out.println(F);
		 
		 }
		 

		
		
	}
	

