package Constructors;

public class Student 
{
	int stid;
	String name;
	int score;
	
	
	
	Student()  // no argument const
	{
		stid=1;
		name="Pooja";
		score=89;		
	}
	
	Student(int id, String nm, int sc)  // parameterized constructor
	{
		stid = id;
		name = nm;
		score = sc;
	}
	
	
	void display()
	{
		System.out.println(stid+"  "+name+"  "+score);
	}
		
}
