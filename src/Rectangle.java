
public class Rectangle implements Shape {
	
	public void draw(){
		System.out.println("Inside Rectangle::draw() method.");
	}
	
	public void area(double sides){
		
		double length = sides/2;
		double width = sides;
		
		double area = width * length;
		
		System.out.println("Area of the Rectangle is " + area);
	}

	public void perimeter(double sides){
		
		double length = sides/2;
		double width = sides;
		
		double perimeter = 2 * (length + width);
		
		System.out.println("The perimeter of the Rectangle is " + perimeter);
	}
}
