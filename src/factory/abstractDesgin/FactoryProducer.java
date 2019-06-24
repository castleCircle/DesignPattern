package factory.abstractDesgin;

import factory.abstractDesgin.abstractfactory.AbstractFactory;
import factory.abstractDesgin.abstractfactory.RoundedShapeFactory;
import factory.abstractDesgin.abstractfactory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		}else {
			return new ShapeFactory();
		}
	}

}
