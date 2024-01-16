import java.util.Scanner;

public class AuthorDemo1 {

	public static void main(String[] args) 
	{	
		Scanner scn = new Scanner(System.in);

		System.out.print("Input author name   : ");
		String name = scn.nextLine();
		
		System.out.print("Input author email  : ");
		String email = scn.nextLine();
		
		System.out.print("Input author gender : ");
		char gender = scn.next().charAt(0);
		
		Author author = new Author(name , email , gender);
		
		System.out.println();
		System.out.println(author);
	}

}
