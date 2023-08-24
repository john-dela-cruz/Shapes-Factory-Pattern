
public class Circle implements Shape {
	
	public void draw(){
		System.out.println("Inside Circle::draw() method.");
	}
	
	public void area(double radius){
		
		double initialArea = radius * radius;
		double area = 3.14 * initialArea;
		
		System.out.println("The area of the Circle is " + area);
	}

	public void perimeter(double radius){
		
		double initialPerim = 2 * 3.14;
		double perimeter = initialPerim * radius;
		
		System.out.println("The circumference of the Circle is " + perimeter);
	}
}
