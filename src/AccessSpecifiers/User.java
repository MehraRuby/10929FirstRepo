package AccessSpecifiers;

public class User 
{
	// cannot access beyond this class
	private String username;
	private String password;
	
	
	// by using constructor
	// we can assign values to private member
	
	
	protected User()
	{
		username="Administrator";
		password="1234";
	}
	
	
	//or
	
	// by creating getter(accessor) / setter(mutator) methods
	
	public void setUsername(String u)
	{		
		username = u;
	}
	
	public void setPassword(String p)
	{
		password = p;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	
}
