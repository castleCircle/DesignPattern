package prototype;

public class PrototypeMain {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape= (Shape)ShapeCache.getShape("1");
		System.out.println("Shaped " + clonedShape.getType() + clonedShape.hashCode());
	
		Shape clonedShape1 =  (Shape)ShapeCache.getShape("2");
		System.out.println("Shaped " + clonedShape1.getType() + clonedShape1.hashCode());
		
		Shape clonedShape2= (Shape)ShapeCache.getShape("3");
		System.out.println("Shaped " + clonedShape2.getType() + clonedShape2
				.hashCode());
		
		Shape clonedShape3= (Shape)ShapeCache.getShape("1");
		System.out.println("Shaped " + clonedShape3.getType() + clonedShape3.hashCode());
		
		Shape clonedShape4 =  (Shape)ShapeCache.getShape("2");
		System.out.println("Shaped " + clonedShape4.getType() + clonedShape4.hashCode());
		
		Shape clonedShape5= (Shape)ShapeCache.getShape("3");
		System.out.println("Shaped " + clonedShape5.getType() + clonedShape5.hashCode());
		
	
	}
}
