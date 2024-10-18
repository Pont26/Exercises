package EnumExample;

//Declaration outside the class
enum Color {
    RED,
    GREEN,
    BLUE;
}

public class ColorTest{
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}