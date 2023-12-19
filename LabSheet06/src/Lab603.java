import java.util.*;

public class Lab603 {

	static Scanner input = new Scanner(System.in);
	static String fullname;
	static String firstname;
	
	public static void main(String[] args)
	{
		System.out.println("Please enter your name, separated by a space");
		
		System.out.print(":");
		fullname = input.next();
		
		abbreviatName(fullname);



	}
	
	public static String abbreviatName(String fullname) 
	{
		for(int i=0 ; i < fullname.length(); i++) 
		{
			if(fullname.charAt(i)==' ') 
			{
				System.out.println();
			}
			else 
			{
			System.out.print(fullname.charAt(i));
			}
		}
		
		return fullname;
	}

}
