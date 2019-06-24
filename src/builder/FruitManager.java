package builder;

public class FruitManager {

	private String name;
	private String color;
	private int size;

	public static class Builder {

		private final String name;
		private String color;
		private int size;

		public Builder(String name) {
			this.name = name;
		}

		public Builder setColor(String color) {
			this.color = color;
			return this;
		}

		public Builder setSize(int size) {
			this.size = size;
			return this;
		}

		public FruitManager builder() {
			return new FruitManager(this);
		}
		
		public String getColor() {
			return color;
		}

	}
	
	public FruitManager(Builder builder) {
		this.name = builder.name;
		this.color = builder.color;
		this.size = builder.size;
	}
	
	public String toString() {
		return this.name + " / " + this.color + " / " + this.size;
	}
	
	public static void main(String[] args) {
		FruitManager fruit = new FruitManager.Builder("fruit").setColor("green").setSize(100).builder();
		System.out.println(fruit.toString());
	}
}
