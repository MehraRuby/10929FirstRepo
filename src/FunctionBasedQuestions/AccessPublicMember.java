package FunctionBasedQuestions;

import AccessSpecifiers.*;  
// import all the class of the package


public class AccessPublicMember 
{

	public static void main(String[] args) 
	{
		PublicAccess ob = new PublicAccess();
		ob.age=3;
		ob.classno=1;
		
		DefaultExample d = new DefaultExample();
		// d.score - error
		// as default member cannot get access in different package
		// or in different source code.
		// protected members are also not get accessed outside of a package
		
		

	}

}
