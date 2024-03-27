package Functions;

public class CallByReference 
{
	//instance variables
	
	int x;
	int z;
	
	void swap(CallByReference ob)
	{
		int c;
		c = ob.x;
		ob.x = ob.z;
		ob.z = c;		
	}

	
	
	public static void main(String[] args) 
	{
		CallByReference obj = new CallByReference();
		obj.x = 1;
		obj.z = 2;
		
		System.out.println("Before Swap \n X: "+obj.x+"\nZ: "+obj.z);
		
		obj.swap(obj);
		
		System.out.println("After Swap \n X: "+obj.x+"\nZ: "+obj.z);
		

	}

}
