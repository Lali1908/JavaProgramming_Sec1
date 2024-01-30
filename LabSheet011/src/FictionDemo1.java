import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner snr = new Scanner(System.in);
		
		System.out.print("Book title : ");
		String bookTitle = snr.nextLine();
		
		System.out.print("Book public Year : ");
		int bookPubYear = Integer.parseInt(snr.nextLine());
		
		FictionBook book = new FictionBook(bookTitle,bookPubYear);
		
		System.out.print("Author name : ");
		String authorName = snr.nextLine();
		
		book.setAuthorName(authorName);
		
		while(!book.checkFormatName()) {
			System.out.print("again, Author name : ");
			authorName = snr.nextLine();
			book.setAuthorName(authorName);
		}
		
		System.out.print("Author email : ");
		
		String authorEmail = snr.nextLine();
		
		book.setEmail(authorEmail);
		while(!book.checkEmail()) {
			System.out.print("again, Author email : ");
			authorEmail = snr.nextLine();
			
			book.setEmail(authorEmail);
		}
		
		System.out.println(book);

	}

}
