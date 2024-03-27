package TypeOfVariables;

public class BlocksExample 
{
	int x;  // state of a class , instance variable , depends on an object of a class
		
	{
		int a;  // local variable
		a=90;
		System.out.println("block 1");		
		a++;
		x=90;
		System.out.println(x);	
		
	}
	
	
	
	{		
		int b;  // local variable
		b=89;
		System.out.println("block 2");
		b++;
		System.out.println(b);
		x=1000;
		System.out.println(x);	
	}
	
	
		
	public static void main(String[] args) 
	{
		
		BlocksExample obj = new BlocksExample();
		System.out.println(obj.x);
		

	}

}
