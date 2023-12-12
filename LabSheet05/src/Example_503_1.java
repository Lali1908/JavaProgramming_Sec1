import java.util.Scanner;

import javax.swing.JOptionPane;

public class Example_503_1 {

	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		
		//String sentence = scan.nextLine();
		
		while(!sentence.endsWith(".")) 
		{
			sentence = JOptionPane.showInputDialog("Input a sentence,again: ");
			//sentence = scan.nextLine();
		}
		//System.out.println();
		
		int spacebar = 0;
		for(int i = 0; i < sentence.length(); i++) 
		{
			if(sentence.charAt(i) == ' ') 
			{
				spacebar += 1;
			}
		}
		JOptionPane.showMessageDialog(null,"This sentence has " + spacebar + " spacebar." + "\nThis sentence has " + (spacebar+1) + " word." );
		
	}

}
