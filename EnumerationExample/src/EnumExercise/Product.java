package EnumExercise;

public class Product {
	private String name;
	private double price;
	private ProductCategory category;
	private double percentagCalculate;
	private double finalPrice;
	
	public Product(String name, double price, ProductCategory category) {
		 this.name = name;
		  this.price = price;
		  this.category = category;
	}
	
	public double calculateFinalPrice() {
	   percentagCalculate = price * (category.getTaxPresentage() / 100);
	   finalPrice = price + percentagCalculate;
       return finalPrice;	
	}
	
   @Override
   public String toString() {
	return this.name +"(" + this.category + ")"+ " Origin Price " + this.price + " Final Price = " + this.finalPrice ;
	   
   }
}
