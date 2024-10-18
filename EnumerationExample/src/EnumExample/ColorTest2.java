package EnumExample;

//declaration enum inside a class
public class ColorTest2 {
	enum Color{
		red,
		green,
		blue;
	}
	
	public static void main(String[] args) {
		Color color= Color.blue;
		System.out.print(color);
		
	}

}
