package Functions;

public class ArrayCallByReference 
{
	
	void arrayOperation(int arr[])
	{
		for(int i=0; i<arr.length ; i++)
		{
			arr[i]=arr[i]+3;
		}
		
	}
	

	public static void main(String[] args) 
	{
		int ar[] = {1,2,3,4,5};
		
		ArrayCallByReference obj = new ArrayCallByReference();
		
		obj.arrayOperation(ar);
		
		for(int a : ar) { System.out.println(a); }
				
	}

}
