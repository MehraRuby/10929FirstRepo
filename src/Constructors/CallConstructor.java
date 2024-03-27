package Constructors;

import AccessSpecifiers.User;


public class CallConstructor 
{

	public static void main(String[] args) 
	{
		Student st = new Student();
		st.display();
	
		
		Student s = new Student(2,"Mohan",88);
		s.display();
		
		Employee emp = new Employee();
		//User usr = new User();   error
		// protected User class constructor will not get access in
		// in different package
		
		
		//Product P = new Product();
		Product.setPrid(1);
		Product.setPrname("Pen");
		
		System.out.println(Product.getPrid());
		System.out.println(Product.getPrname());
						

		new OverLoadConstructor();
		new OverLoadConstructor("Java");
		new OverLoadConstructor(12.56F);
		new OverLoadConstructor(1000);
		
	}

}

