import java.text.DecimalFormat;
import java.util.*; //1.import
public class Example3 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		//2.create class
		Scanner input = new Scanner(System.in);
		
		//3.display
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input product per unit : ");
		float priceperUnit = input.nextFloat();
		
		System.out.println();

		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total price is " + totalPrice + "baht.");
		
		float vat  = totalPrice + (totalPrice * 7 /100);
		System.out.println("Add VAT 7%  is " + frm.format(vat) + "baht.");
	}

}
