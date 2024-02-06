import java.util.*;
import java.io.*;

public class Example1201 {
	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt")); 
		
		while(readFile.hasNext()) 
		{
			String fname = readFile.next();
			
			readFile.next();
			
			readFile.next();
			
			String email = readFile.next().toUpperCase();
			
			System.out.println(fname + " " + "(" + email + ")");
			
		}
		readFile.close();
	}

}
