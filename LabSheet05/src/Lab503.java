import java.util.Scanner;

public class Lab503 {

	public static void main(String[] args)
	{
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Message : ");
		String message = scan.nextLine();
		
		String text = "";
		int countW = 0;
		
		if(message.indexOf("nichi") >= 0)
		{
			countW++ ;
		}
		
		if(countW == 0) 
		{
			
			System.out.print(message);
		}
		else 
		{
			System.out.print("Nichi is a sentence");
		}

	}

}
