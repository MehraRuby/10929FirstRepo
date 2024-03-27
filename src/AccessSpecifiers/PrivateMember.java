package AccessSpecifiers;


public class PrivateMember 
{

	public static void main(String[] args) 
	{
		User usr = new User();
		
		usr.setUsername("Admin");
		usr.setPassword("1234");
		
		
		System.out.println(usr.getUsername());
		System.out.println(usr.getPassword());

	}

}
