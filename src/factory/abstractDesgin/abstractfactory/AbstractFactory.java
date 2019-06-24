package factory.abstractDesgin.abstractfactory;

import factory.abstractDesgin.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shapeType);
}
