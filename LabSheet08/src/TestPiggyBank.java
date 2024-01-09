import java.util.*;
public class TestPiggyBank 
{
	static PiggyBank pb = new PiggyBank();
	static Scanner srn = new Scanner(System.in);
	

	public static void main(String[] args) 
	{
		
		inputCoin();
		MainMenu();
		
		/*PiggyBank pb = new PiggyBank();
		
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/

	}
	
	public static void inputCoin() 
	{
		System.out.println("Money total : " + pb.getTotal());
		
		System.out.print("Please define size of PiggyBank : ");	
		int sizeofPiggyBank = srn.nextInt();
		
		pb.setPiggyBank(sizeofPiggyBank);
		
		System.out.println("Size of your piggyBank: " + pb.getPiggyBank());
		System.out.println();
		
		MainMenu();
	}
	
	public static void MainMenu() 
	{
		while(true)
		{
			System.out.println("========================\n"
								+ "Menu of PiggyBank"
								+ "\n========================");
			System.out.println("[1] one baht."
							+ "\n[2] two baht."
							+ "\n[3] five baht."
							+ "\n[4] ten baht."
							+ "\n[5] Exit");
			System.out.println( "========================");
			
			System.out.print("Plese Select Menu[1-5] : ");
			int selectMenu = srn.nextInt();
			
			if(selectMenu == 1) 
			{
				System.out.print("Insert 1 Baht Money: ");
				int money = srn.nextInt();
				pb.addOne(money);
				
				System.out.println("Money total : " + pb.getTotal());
				
				System.out.println();
			}
			
			else if(selectMenu == 2) 
			{
				System.out.print("Insert 2 Baht Money: ");
				int money = srn.nextInt();
				pb.addTwo(money);
				
				System.out.println("Money total : " + pb.getTotal());
				
				System.out.println();
			}
			
			else if(selectMenu == 3) 
			{
				System.out.print("Insert 5 Baht Money: ");
				int money = srn.nextInt();
				pb.addFive(money);
				
				System.out.println("Money total : " + pb.getTotal());
				
				System.out.println();
			}
			
			else if(selectMenu == 4) 
			{
				System.out.print("Insert 10 Baht Money: ");
				int money = srn.nextInt();
				pb.addTen(money);
				
				System.out.println("Money total : " + pb.getTotal());
				
				System.out.println();
			}
			else 
			{
				System.out.println("Bye Bye");
				break;
			}
		}
	}
	

}
