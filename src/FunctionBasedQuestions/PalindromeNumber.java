package FunctionBasedQuestions;

/* function to reverse the number without using reverse() and find wther it is 
 * palindrome or not
 */


public class PalindromeNumber 
{
	
	String isPalindrome(long n)
	{
		long rev = reverse(n);
		System.out.println("Reverse number : "+rev);
		
		return rev == n ? "Palindrome" :"Not Palindrome";
		
	}
	
	
	long reverse(long n)
	{
		long rem,temp=0;
		while( n!=0 )
		{
			rem = n % 10;
			n = n / 10;
			temp = temp * 10 + rem;			
		}
		
		return temp;				
	}
	
	
	
	public static void main(String[] args)
	{
		long num =12329731L;
		
		PalindromeNumber obj = new PalindromeNumber();
		
		System.out.println(obj.isPalindrome(num));					
	}

}


