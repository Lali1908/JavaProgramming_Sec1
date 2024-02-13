import java.util.*;
import java.io.*;

public class SentenceText {

	public static void main(String[] args) throws IOException{
		// create for write to file
		PrintStream writeFile = new PrintStream((new File("d://txtFile//sentence.txt")));
		
		//input data from console
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		while(true){
			System.out.print("Sentence: ");
			String word = input.next();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			//save to file
			writeFile.println(i + ":" + word);
			i++;
		}
		
		System.out.println("File is save!!");
		writeFile.close();
		

	}

}
