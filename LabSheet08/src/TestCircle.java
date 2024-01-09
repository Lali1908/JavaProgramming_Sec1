
public class TestCircle {

	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		c1.radius = 12.5;
		System.out.println("the area of object c1 is " + c1.getArea());
		
		c2.radius = 5.5;
		System.out.println("the area of object c2 is " + c2.getArea());
		
		System.out.println(showColor("red"));
	}
	
	public static String showColor(String color) 
	{
		return "The color is" + color;
	}

}
