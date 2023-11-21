import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Example3 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.0");
		double weight, height, bmi = 0;
		
		weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));

		height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		height *= 0.01; 
		
		bmi = weight / (height*height);
		if(bmi <= 18.5) 
		{
			JOptionPane.showMessageDialog(null,
					"BMI=" + frm.format(bmi) + "\nYou're Underweight","BMI" ,JOptionPane.WARNING_MESSAGE);
		}
		else if(bmi >= 18.5 && bmi <= 24.9 ) 
		{
			JOptionPane.showMessageDialog(null,
					"BMI=" + frm.format(bmi) + "\nYou're Normal-weight","BMI" ,JOptionPane.WARNING_MESSAGE);
		}
		else if(bmi >= 25.0 && bmi <= 29.9 ) 
		{
			JOptionPane.showMessageDialog(null,
					"BMI=" + frm.format(bmi) + "\nYou're Over-weight","BMI" ,JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null,
					"BMI=" + frm.format(bmi) + "\nYou're Obesity","BMI" ,JOptionPane.WARNING_MESSAGE);
		}
		
		/*String bmiCategory;
		if(bmi<18.5) bmiCategory = "Underweight";
		else if(bmi >= 18.5 && bmi <= 24.9 ) bmiCategory = "Normal-weight";
		else if(bmi >= 25.0 && bmi <= 29.9 ) bmiCategory = "Over-weight";
		else bmiCategory = "Obesity";
		JOptionPane.showMessageDialog(null,
		"BMI=" + String.format("%.1f"bmi) + "\nYou're" + bmiCategory ,"BMI" ,JOptionPane.WARNING_MESSAGE);*/
	}

}
