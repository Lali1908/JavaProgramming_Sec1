import java.text.DecimalFormat;

import javax.swing.*; //1.import

public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final int BUFFET = 299;
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?:"));
		
		double discount, totalPrice = 0;
		totalPrice = BUFFET * numberofCustomer;
		
		int member;
		do {
		member = JOptionPane.showConfirmDialog(null, "Total Price is " + frm.format(totalPrice) + " baht." 
				+ "\nDo you have a member card?");
		
		if(member == JOptionPane.YES_OPTION) 
		{
			//discount = totalPrice - (totalPrice * 10 / 100);
			
			discount = totalPrice * 90 /100;
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is " + frm.format(discount) + " baht.");		
		}
		else if(member == JOptionPane.NO_OPTION) 
		{
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is " + frm.format(totalPrice) + " baht.");		
		} 
		
		}while(member == JOptionPane.CANCEL_OPTION);
		

		

	}

}
