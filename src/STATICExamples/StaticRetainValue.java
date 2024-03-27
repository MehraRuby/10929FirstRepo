package STATICExamples;

/* Static variables can retain their values*/
class VALUE
{
	 static int val;

	// static block get called before default constructor
	static
	{
		val=90;
	}
		
	void operation()
	{
		val++;
	}
	
	void display()
	{
		System.out.println(val);		
	}
}

public class StaticRetainValue 
{	
	public static void main(String[] args)
	{
		
	VALUE V1 = new VALUE();
	V1.operation(); V1.display();
	
	
	VALUE V2 = new VALUE();
	V2.operation(); V2.display();
	
	
	VALUE V3 = new VALUE();
	V3.operation(); V3.display();
	
	
	VALUE V4 = new VALUE();
	V4.operation(); V4.display();
	
	
	VALUE V5 = new VALUE();
	V5.operation(); V5.display();
			
		
		
	}
}
