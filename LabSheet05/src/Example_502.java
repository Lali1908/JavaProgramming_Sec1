import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) 
	{
		String yourEmail = JOptionPane.showInputDialog("Input your e-mail: ");
		
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) 
		{
			yourEmail = JOptionPane.showInputDialog("Input your e-mail,again : ");
		}
		yourEmail = yourEmail.toLowerCase();
		
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("email.com")) 
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is " + yourEmail );
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
		

	}

}
