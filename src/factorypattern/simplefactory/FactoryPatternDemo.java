package factorypattern.simplefactory;

import org.junit.Test;

public class FactoryPatternDemo {
	@Test
	public void invoke() {
		Shape shape1 = ShapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = ShapeFactory.getShape("Rectangle");
		shape2.draw();
	}
}
