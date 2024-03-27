package FunctionBasedQuestions;

public class RecursiveFactorial 
{

	long fact(int num,long temp)
	{
		if(num == 0)
			return temp;
	
		else
		{
			temp = temp * num ;
			num--;
			return fact(num,temp);					
		}
		
	}
	
	public static void main(String[] args)
	{
		int n = 10;
		long result;
		RecursiveFactorial obj = new RecursiveFactorial();
		result = obj.fact(n, 1);
		
		System.out.println("FACTORIAL: "+result);
			
	}
	
}
