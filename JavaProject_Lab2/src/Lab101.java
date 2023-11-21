import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Product Name : ");
		String productName = input.nextLine();
		
		System.out.print("Input Product Unit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input Product per unit : ");
		float priceperUnit = input.nextFloat();
		
		//System.out.println("");

		System.out.println("---------------------------------------------");
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is " + frm.format(totalPrice) + "baht.");
		System.out.println("---------------------------------------------");
		
		System.out.println("How many discount (%) : ");
		
		System.out.println("---------------------------------------------");
		
		
		System.out.print("How many disconut (%) : ");
		int discount = input.nextInt();
	}

}
