package Functions;

public class VariableLengthArgument 
{
	// variable length argument are three dots    ...args
	// parameter list is not fixed
	
	void sum(int... z)  // growable array []
	{
		int temp=0;
		for(int a:z)
		{
			temp=temp+a;
		}
		
		System.out.println("Sum : "+temp);
	}
	
	
	
	public static void main(String[] args) 
	{
		VariableLengthArgument obj = new VariableLengthArgument();
		obj.sum();
		obj.sum(1,2,3,4,5,6,7,8,9,10);
		obj.sum(10);
		obj.sum(1,2,3,4,5);

	}

}
