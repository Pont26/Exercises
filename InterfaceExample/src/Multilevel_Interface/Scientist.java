package Multilevel_Interface;

public class Scientist implements Human{

	@Override
	public void breath() {
		System.out.println("is breathing");
		
	}

	@Override
	public void think() {
		System.out.println("is thinking");
		
	}
}
