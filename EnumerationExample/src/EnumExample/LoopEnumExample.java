package EnumExample;

enum Color1{
	Red,
	Black,
	White;
}

public class LoopEnumExample {
	
	public static void main(String[] args) {
		for(Color1 colors: Color1.values()) {
			System.out.println(colors);
		}
		
	}

}
