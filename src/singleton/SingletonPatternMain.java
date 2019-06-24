package singleton;

public class SingletonPatternMain {
	public static void main(String[] args) {
		
		SingleObject object =SingleObject.getInstance();
		object.showMesssage();
		System.out.println(object.hashCode());
		
		SingleObject object1 =SingleObject.getInstance();
		object1.showMesssage();
		System.out.println(object1.hashCode());
	}
}
