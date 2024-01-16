
public class Author 
{
	private String name, email;
	char gender;
	
	Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	Author(String name, String email)
	{
		this.name = name;
		this.email = email;
		gender = ' ';
	}
	Author()
	{
		name = "";
		email = "";
		gender = ' ';
	}
		
	public String getName() 
	{
		return name;
	}
		
	public String getEmail() 
	{
		return email;
	}
	
	public String getGenderName() 
	{
		if(gender=='m'||gender=='M') 
		{
			return "Male";
		}
		else if(gender=='f'||gender=='F') 
		{
			return "Female";
		}
		else 
		{
			return null;
		}		
	}
	
	public String toString()
	{
		return "Author name:" + name + "(" + email + ";"+ getGenderName() + ")";
	}

}
