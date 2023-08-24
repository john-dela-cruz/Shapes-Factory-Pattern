
public class Square implements Shape {
	
	public void draw(){
		System.out.println("Inside Square::draw() method.");
	}

	public void area(double side) {
		
		double area = side * side;
		
		System.out.println("The area of the Square is " + area);
	}

	public void perimeter(double side) {
		
		double perimeter = 4 * side;
		
		System.out.println("The perimeter of the Square is " + perimeter);
	}

}
