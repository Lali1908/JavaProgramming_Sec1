import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int x = scan.nextInt();
		
		System.out.print("Input value of Y : ");
		int y = scan.nextInt();
				
		while(x > y) {
			
			System.out.print("Input value of Y, again : ");		
		
			if(x < y) {
			System.out.println(x + "+" + y + "=" + x+y);}
	}

}
}
