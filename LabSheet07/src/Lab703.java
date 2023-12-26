import java.util.Scanner;

public class Lab703 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    int[] number = {78, 36, 58, 41, 25, 92, 75};
	    
	    int input;
	    
		System.out.print("Input index of array : ");
		input = scan.nextInt();
		
		while(input < 0||input >= number.length) 
		{
			System.out.print("Input index of array, again : ");
			input = scan.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Value in current index is " + number[input]);
		if(input==(number.length-1)) 
		{
			System.out.println("Sorry, " + input + " is the last index in array.");
		}
		else 
		{
			System.out.println("Value in next index is " + number[input + 1]);
		}
	}

}
