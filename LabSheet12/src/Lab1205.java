import java.io.*;
public class Lab1205
{
	public static void main(String[] args)throws IOException  {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//student.txt"));
		String tmp = "";
		int i = 1;
		Head();
		while((tmp = readFile.readLine()) != null)
		{
			String[]data=tmp.split(" ");
			double grade = Double.parseDouble(data[4]);
			char fName = data[2].charAt(0);
			String lName = data[3];
			String ID = data[0];
			System.out.println(i+".\t"+data[0]+"\t"+Level(ID)+"\t"+fName+"."+lName+"\t"+grade+"\t"+Status(grade));	
			i++;
		}
	}
	public static String Level(String id)
	{
		int year = 22 - Integer.parseInt(id.substring(0,2));
		return year + "th";
	}
	public static String Status(double gradestatus)
	{
		if(gradestatus > 2.00) { return "Pass"; }
		else if(gradestatus >= 1.00 && gradestatus <= 2.00) { return "Critical"; }
		else { return "Retired"; }
	}
	public static void Head() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("****************************************************************");
	}
 
}