package TypeOfVariables;

public class ClassVariables 
{
	static String name;
	static double score;  // default value is 0
	static int age;

	
	static   // static block
	{
		name = "Pooja";
		score = 90.89D;
		age = 3;	
		System.out.println(name);
		System.out.println(score);
		System.out.println(age);
	}
	
	// static block get called before default constructor call
	// get assigned in a memory before constructor and only once
	// life cycle depends on class , not on object
	// in Java 4 , introduce that we can access static members with an object as well.
	// static members get access with the class name- correct calling method
	
	
	
	public static void main(String[] args)
	{
		System.out.println(ClassVariables.name);
		System.out.println(ClassVariables.score);
		System.out.println(ClassVariables.age);
		
	}
	
}

/*
 * static
 * 
 * type of classes
 * Constructor
 * OOPS
 * 
 * 
 */

