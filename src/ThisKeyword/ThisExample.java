package ThisKeyword;

public class ThisExample 
{
	int score;
	
	ThisExample(int score)
	{
		this.score = score;
	}
	
	void display()
	{
		System.out.println(this.score);
	}

	
	public static void main(String[] args)
	{
		ThisExample th = new ThisExample(90);
		th.display();
	}
	
	
}
