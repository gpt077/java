class InvalidAgeException extends Exception
{
	public InvalidAgeException(String s)
	{
		super(s);
	}
}
class UserException
{
	static void validate(int age) throws InvalidAgeException
	{
		if (age<18)
		{
		throw new InvalidAgeException("Age is not valid to vote");
		}
		else
		{
		System.out.println("Welcome to Voting");
		}
	}	
	public static void main(String args[])
	{
		try
		{
			validate(13);
		}
		catch(InvalidAgeException ex)
		{
				System.out.println("Caught the Exception");
				System.out.println("Error Occured "+ex);
				
		}
	
	
	}
	

}