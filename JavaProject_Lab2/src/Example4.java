import java.text.DecimalFormat;

import javax.swing.*; //1.import

public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		
		/*String strUnit = JOptionPane.showInputDialog("Input Product Unit:");
		int productUnit = Integer.parseInt(strUnit);*/
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit:"));
		
		/*String strPrice = JOptionPane.showInputDialog("Input Price per unit:");
		float pricePerUnit = Float.parseFloat(strPrice); */
		float pricePerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit:"));
		
		float totalPrice = productUnit * pricePerUnit;
		
		float vat = totalPrice + (totalPrice * 7 / 100);
		JOptionPane.showMessageDialog(null,"Total Price is " + frm.format(totalPrice) + " baht."
				+"\nAdd VAT 7% is " + frm.format(vat) + " baht.");
	}

}
