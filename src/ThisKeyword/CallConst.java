package ThisKeyword;

public class CallConst 
{
	CallConst()
	{   
		this("Java");
		System.out.println("no argument");
	}
	CallConst(String nm)
	{
		this(89.90F);
		System.out.println("String");
	}
	CallConst(float al)
	{
		this(90);
		System.out.println("Float");
	}
	CallConst(int s)
	{
		this(89.78D);
		System.out.println("Integer");
	}
	CallConst(double p)
	{
		this(90L);
		System.out.println("Double");
	}
	CallConst(long a)
	{		
		System.out.println("Long");
	}
	
	
	public static void main(String[] args)
	{
		
		new CallConst();
		
	}
}

/* 
Git Hub Command
Type of classes
Sorting on array
Enum DT
String equals() and == difference
OOPS
*/
