package FunctionBasedQuestions;

public class RecursivePrimeNumber 
{
	
	String prime(int num,int t)
	{
		if(t == num)		
			return "Prime";		
		else if(num % t == 0)		
			return "Not Prime";
		else
		{
			t++;
			return prime(num,t);		
		}				
	}
		
	public static void main(String[] args) 
	{
		RecursivePrimeNumber obj = new RecursivePrimeNumber();
		System.out.println(obj.prime(29, 2));
		

	}

}
