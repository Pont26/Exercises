package EnumExercise;


enum ProductCategory{
	ELECTROINICS(15.0),
	CLOTHING(10.0),
	GROCERY(5.0),
	FURNITURE(12);
	private double tax;

	ProductCategory(double tax) {
		this.tax = tax;
	}
	
	public double getTaxPresentage() {
		return tax;
	}
}

