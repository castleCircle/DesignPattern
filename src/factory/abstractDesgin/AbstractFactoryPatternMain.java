package factory.abstractDesgin;

import factory.abstractDesgin.abstractfactory.AbstractFactory;

public class AbstractFactoryPatternMain {
	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
		Shape shape = shapeFactory.getShape("rectangle");
		shape.draw();
		
		shape = shapeFactory.getShape("square");
		shape.draw();
		
		shapeFactory = FactoryProducer.getFactory(false);
		shape = shapeFactory.getShape("rectangle");
		shape.draw();
		
		shape = shapeFactory.getShape("square");
		shape.draw();
		
		
	}
}
