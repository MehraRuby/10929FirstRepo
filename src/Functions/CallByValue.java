package Functions;


public class CallByValue 
{
	void swap(int a,int b)  // arguments - a , b
	{
		int c;
		c = a;
		a = b;
		b = c;
	}
	
		
	public static void main(String[] args) 
	{
		int x=1,z=2;
		
		CallByValue obj = new CallByValue();
		
		System.out.println("Before Swap \n X: "+x+"\nZ: "+z);
		
		obj.swap(x, z);
		
		System.out.println("After Swap \n X: "+x+"\nZ: "+z);
		
		

	}

}
