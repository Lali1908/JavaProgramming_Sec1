import java.util.*;
import java.io.*;
import java.text.*;
public class ATMBanking {
 
 
	public static void main(String[] args) throws IOException {
		NumberFormat formatter = new DecimalFormat("#-###-###-##-#"); 
		Scanner readFile = new Scanner(new File("d://ATMBookBank.txt"));
		Scanner input = new Scanner(System.in);
		boolean check = false;
		System.out.print("Enter account number\t: ");
		String num = input.next();
		while(readFile.hasNext()) {
			num=readFile.next();
			if(formatter.format(num) != null) {
				System.out.print("Input wrong type, Enter account number\t: ");
				num = input.next();
				check = true;
			}
			else break;
		}
		System.out.print("Enter password: ");
		String pas = input.next();
		while(readFile.hasNext()) {
			pas=readFile.next();
		}
		System.out.print("Enter money: ");
		int mon = input.nextInt();
		while(readFile.hasNext()) {
			mon=readFile.nextInt();
			}
		}
 
	}