package AccessSpecifiers;

public class DefaultAccessSpecifier {

	public static void main(String[] args) 
	{
		
		DefaultExample obj = new DefaultExample();
		obj.score=90;
		obj.name="Pooja";
		
		obj.displayData();
		obj.x=90;
		
		
		PublicAccess ob = new PublicAccess();
		ob.age=4;
		ob.classno=1;
					
	}
}
