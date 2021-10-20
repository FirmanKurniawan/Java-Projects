//Creating a user defined exception
import java.util.*;
import java.io.*;

class w10b{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your marks : " );
		int marks = s.nextInt();
		try{isEligible(marks);}
		catch(Exception ex){
			System.out.println("Exception occured : " + ex);
		}
	}
	
	static void isEligible(int marks) throws notEligible
	{
		if(marks>60)
			System.out.println("Opening the test window...");
		else
			throw new notEligible("Better luck next time...");
	}
}

class notEligible extends Exception{
	notEligible(String s){
		super(s);
	}
}