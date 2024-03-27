package FunctionBasedQuestions;

/* function returns the factorial of the entered number */

import java.util.Scanner;

public class Factorial 
{
	
	long fact(int n)
	{
		long temp = 1;
		for(int i = n ; i >= 1 ; i--)
		{
			temp = temp * i;
		}
		
		return temp;
		
	}
	
	
	
	public static void main(String[] args)
	{
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the number: ");
		num = sc.nextInt();
		
		Factorial obj = new Factorial();
		
		long result = obj.fact(num);
		System.out.println("Factorial : "+result);
						
	}

}
