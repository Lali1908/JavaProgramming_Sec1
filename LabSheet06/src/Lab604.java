import java.util.*;
public class Lab604 {

	static Scanner input = new Scanner(System.in);
	static String studentId,subId;
	static int subjectId;
	boolean stdIT,subIT;
	
	public static void main(String[] args) 
	{
		//Scanner input = new Scanner(System.in);
		inputStudent();

	}
	
	public static void inputStudent() 
	{
		do {
		System.out.print("Enter Student Id: ");
		studentId = input.next();
		
		System.out.print("Enter Subject Id: ");
		subjectId = input.nextInt();
		
		subId = subjectId + "";
		}while(!isLength(studentId, subId));
		
		System.out.println();
		
		displayData(isITStudent(studentId),isITSubject(subId));
	}
	
	public static boolean isLength(String sid ,String subId) 
	{
		if(sid.length()==10&&subId.length()==7) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean isITStudent(String sid) 
	{
		if(sid.substring(0, 3).equals("211") && sid.substring(3, 6).equals("311")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean isITSubject(String subId) 
	{
		return false;
	}
	
	public static void displayData(boolean stdIT, boolean subIT) 
	{
		if(stdIT == true) 
		{
			System.out.println("Student id: " + studentId + " 1st year student in IT");
		}
		else 
		{
			System.out.println("Student id: " + studentId + "is not 1st year student in IT");
		}
		
		if(subIT == true)
		{
			System.out.println("Enroll in courses for Year 1");
		}
		else
		{
			System.out.println("not enroll in courses for Year 1");
		}
	}
}
