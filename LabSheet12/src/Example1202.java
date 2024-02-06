import java.io.*;
import java.util.Scanner;

public class Example1202 {
public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Section: ");
		int sec = input.nextInt();
		Header(sec);
		showListStudent(sec);

	}
	
	public static void showListStudent(int section)throws IOException
	{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		
		while((tmp = readFile.readLine()) != null);{
			String[] data = tmp.split("\t");
			
			double midtemScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			
			int secTion = Integer.parseInt(data[3]);
			
			if(secTion == section) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScore+"\t"+finalScore);
			}
		}
		readFile.close();
	}
	
	public static String findResult(double midtemscore, double finalscore) 
	{
		double totalScore = midtemscore + finalscore;
		return totalScore < 40? "Fail" : "Pass";
	}
	
	public static void Header(int sec) 
	{
		System.out.println("*********************************************");
		System.out.println("\tList of Data for Section" + sec);
		System.out.println("*********************************************");
	}

}
