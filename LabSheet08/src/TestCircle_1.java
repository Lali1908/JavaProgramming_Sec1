import java.text.*;
public class TestCircle_1 {

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("0.##");
		
		Circle_1 c1 = new Circle_1();
		
		Circle_1 c2 = new Circle_1();
		
		Circle_1 c3 = new Circle_1();

		c1.setRadius(2.0);
		c1.setColor("blue");
		//System.out.print("Circle area of object c1 is " + c1.getArea());
		System.out.print("Circle 1 area  = " + (df.format(c1.getArea())));
		System.out.println(", and color is " + (df.format(c1.getColor())));
		
		c2.setRadius(2.0);
		c2.setColor("red");
		System.out.print("Circle 2 area = " + (df.format(c2.getArea())));
		System.out.println(", and color is " + (df.format(c2.getColor())));
		
		c3.setRadius(1.0);
		c3.setColor("red");
		System.out.println("Circle 3 area = " + (df.format(c3.getArea())));
		//System.out.println(", and color is " + c3.getColor());
	}
	
	public static String showColor(String color) 
	{
		return "The color is" + color;
	}

}
