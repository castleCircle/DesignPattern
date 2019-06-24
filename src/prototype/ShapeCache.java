package prototype;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ShapeCache {

	private static Map<String, Shape> shareMap = new HashMap<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shareMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache() {
		Circle circle= new Circle();
		circle.setId("1");
		shareMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shareMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shareMap.put(rectangle.getId(), rectangle);
	}
	
}
