import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input number : ");
		
		int previousNumber = scan.nextInt();
		
		int currentNumber;
		
		while(true) {
			System.out.print("Input number : ");
			currentNumber = scan.nextInt();
			
			if(currentNumber < previousNumber) {
				
				System.out.println();
				System.out.print("BYE BYE");
				break;
			}
			previousNumber = currentNumber;
		}
		

	}

}
