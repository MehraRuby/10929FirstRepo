package Constructors;

public class Product 
{
	static int prid;
	static String prname;
	
	
	private Product()
	{}


	// whenever private constructor is in a class
	// then all the members of such a class must be static 
	// means members get  declared only once and used anywhere within a project
	// by using class name . Life cycle of there members 
	// depends on a class not on object of a class
	// This class Pattern is called SINGLETON Pattern
	// Example -> System class
	
	
	
	public static int getPrid() {
		return prid;
	}


	public  static void setPrid(int pr) {
		prid = pr;
	}


	public  static String getPrname() {
		return prname;
	}


	public  static void setPrname(String pr) {
		prname = pr;
	}	
}
