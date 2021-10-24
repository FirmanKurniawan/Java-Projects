
//Write a Program to Display Fibonacci Series upto nth term (n is entered by user)

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n,temp1=0, temp2=1,fact;
		System.out.println("Enter value of N");
		n =sc.nextInt();
		System.out.print("Factorial of "+n+" is : ");
		
		for (int i=1; i<n;i++)
		{
			if(i==1) {
				System.out.print(temp1+" ");

			}
			if(i==2) {
				System.out.print(temp2+" ");

			}
			 fact=temp1+temp2;
			 temp1=temp2;
			 temp2=fact;
			 System.out.print(fact+" ");
			 
		}
		sc.close();
	}

}
#hacktoberfest2021
#hacktober-Happy
