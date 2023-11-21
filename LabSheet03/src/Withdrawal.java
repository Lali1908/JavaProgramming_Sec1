import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();	
		int balance = rand.nextInt(9) * 100000;
		DecimalFormat frm = new DecimalFormat("###,###");
		
		int withdrawMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " 
							+ frm.format(balance) 
							+ "\nInput money to withdraw:"));
		//int bank1 = 1000, bank2 = 500, bank3 = 100;
		
		int sum = withdrawMoney % 100;
		

		
		if(withdrawMoney >= 20000) 
		{
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw more than balance" ,"ERROR" ,JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawMoney > balance) {
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw more than 20,000"  ,"ERROR" ,JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawMoney % 100 != 0) {
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw " + sum + " baht." ,"ERROR" ,JOptionPane.ERROR_MESSAGE);
		}
		/*else {
			JOptionPane.showMessageDialog(null,"Your withdraw " + withdrawMoney 
					+ "\n1,000 = " + bank1
					+ "\n500 = " + bank2
					+ "\n100 = " + bank3);
		}*/
		else {
			JOptionPane.showMessageDialog(null,"Your withdraw " + withdrawMoney 
				+ "\n1,000 = " + frm.format(withdrawMoney / 1000)
				+ "\n500 = " + frm.format((withdrawMoney % 1000) / 500 )
				+ "\n100 = " + frm.format((withdrawMoney % 500)  / 100));
			}
		
		
		
		
	}

}
