import java.io.*; 

public class PiggyBank 
{
	public static final String ANSI_RESET = "\u001B[0m"; 
	public static final String ANSI_RED = "\u001B[31m"; 
	
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;

	public void setPiggyBank(int s) 
	{
		clear();
		size = s;
	}
	
	public int getPiggyBank() 
	{
		return size;
	}
	
	public void clear() 
	{
		one = 0;
		two = 0;
		five = 0;
		ten = 0;
	}
	
	public int getTotal() 
	{
		return one + (2* two) + (5 * five) + (10 * ten);
	}
	
	public void addOne(int c) 
	{
		if(getTotal() + c <= size) 
		{
			one += c;
		}
		else
		{
			System.out.println(ANSI_RED + "Piggy Bank Full" + ANSI_RESET);
		}
	}
	
	public void addTwo(int c) 
	{
		if(getTotal() + (2 * c) <= size) 
		{
			two += c;
		}
		else
		{
			System.out.println(ANSI_RED + "Piggy Bank Full" + ANSI_RESET);
		}
	}
	
	public void addFive(int c) 
	{
		if(getTotal() + (5 * c) <= size) 
		{
			five += c;
		}
		else
		{
			System.out.println(ANSI_RED + "Piggy Bank Full" + ANSI_RESET);
		}
	}
	
	public void addTen(int c) 
	{
		if(getTotal() + (10 * c) <= size) 
		{
			ten += c;
		}
		else
		{
			System.out.println(ANSI_RED + "Piggy Bank Full" + ANSI_RESET);
		}
	}
	

}
