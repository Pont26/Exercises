package Multiple_Interface;

public class Artist implements Painter, Musician {

	@Override
	public void playMusic() {
		System.out.println("Playing music");
		
	}

	@Override
	public void paint() {
	  System.out.println("Painting");
	}


	

}
