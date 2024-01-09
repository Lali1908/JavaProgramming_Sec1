import javax.swing.JOptionPane;

public class Lab705 {

	public static void main(String[] args) 
	{
		int[] number = new int[5];
		
		for(int i = 0; i < number.length; i++) 
		{
			JOptionPane.showInputDialog("Input number " + (i+1) + " : ");
			number = new int[5];
			
		}
		
		showEven(number);
		showOdd(number);
	}
	
	public static void showEven(int[] nums) 
	{
		int eve = 0;
		  for(int _number : nums) 
		    {
		    	if(_number % 2 == 0)
		    	{
		    		 eve = eve + _nums + " ";
		        }
		    }
		   JOptionPane.showMessageDialog(null, "List of even number: \n"+ eve);
	}
	
	public static void showOdd(int[] nums) 
	{
		int odd = 0;
		  for(int _number : nums) 
		    {
		    	if(_number % 2 == 1)
		    	{
		    		odd += nums + " ";
		        }
		    }
		  JOptionPane.showMessageDialog(null, "List of even number: \n"+ odd);
	}
}
