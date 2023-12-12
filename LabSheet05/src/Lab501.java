import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab501 {

	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Full Name: ");
		String fName = scan.nextLine();
		
		int space = fName.trim().indexOf(" ");
		
		if(space == -1)
		{
			System.out.print("Incorrect Name");
			fName = scan.nextLine();
		}
		else 
		{
			System.out.println("First Name: " + fName.substring(0, space));
			
			System.out.println("Last Name: " + fName.substring(space));
		}
		
		System.out.println(fName.substring(space));
		System.out.println();

	}

}
