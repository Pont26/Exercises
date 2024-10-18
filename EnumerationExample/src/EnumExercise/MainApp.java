package EnumExercise;

public class MainApp {
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 1000.0, ProductCategory.ELECTROINICS);
		Product p2 = new Product("T-Shirt", 50.0, ProductCategory.CLOTHING);
		Product p3 = new Product("Sofa", 500.0, ProductCategory.FURNITURE);
		p1.calculateFinalPrice();
		p2.calculateFinalPrice();
		p3.calculateFinalPrice();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
