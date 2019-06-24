package factory.abstractDesgin.abstractfactory;

import factory.abstractDesgin.Rectangle;
import factory.abstractDesgin.Shape;
import factory.abstractDesgin.Square;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
