
public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		shape1.draw();
		shape1.area(5);
		shape1.perimeter(5);

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		shape2.draw();
		shape2.area(6);
		shape2.perimeter(6);
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		
		shape3.draw();
		shape3.area(5);
		shape3.perimeter(5);

	}

}
