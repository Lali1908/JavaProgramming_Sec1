public abstract class Shape {

	private String color;
	
	Shape(String color){ this.color = color; }
	
	//Shape(){ this.color = " "; }
	
	Shape(){ this.color = null; }
	//abstract method
	
	public abstract double getArea();
	
	public String toString(){ return"Color = "+this.color; }
}
