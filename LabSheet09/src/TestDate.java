
public class TestDate {

	public static void main(String[] args) {

		Date d1 = new Date(2023,2,8);
		System.out.print(d1);
		
		//test set,get method
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setDay(23);
		
		System.out.println();
		System.out.println(d1);
		
		System.out.println("Year is: "+d1.getYear());
		System.out.println("Month is: "+d1.getMonth());
		System.out.println("Day is: "+d1.getDay());
		System.out.println();
		d1.setDate(2024, 2, 16);
		System.out.println(d1);


	}

}
