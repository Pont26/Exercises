package EnumExample;


 enum Color3{
	 Red,
	 Green,
	 Blue;
	 
	 //Enum's constructor
	 //constant 
	 private Color3() {
		 System.out.println("Enum Constructor called for:  "+ this.toString());
	 }
	 
	 //Enum's Method
	 public void colorInfo() {
		 System.out.println("Enum Method");
		 
	 }
	
}


public class EnumAndMethods {
	public static void main(String[] args) {
		Color3 color = Color3.Blue;
		System.out.println(color);
		
		color.colorInfo();
		
		
	}
	

}
