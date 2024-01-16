import java.util.*;

public class BookDemo {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		Book book = new Book();
		
		System.out.print("Input book title   : ");
		book.setTitle(scn.nextLine()); 
		
		System.out.print("Input book price   : ");
		book.setPrice(scn.nextFloat());
		
		System.out.print("Input publish year : ");
		book.setPublishyear( scn.nextInt());
		
		System.out.println();
		
		System.out.println(book.toString());

	}

}
