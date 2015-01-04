package objects;

import pacman.Game;

public class Punkt extends ImageObject {

	/** Path to the image on the filesystem. */
	private static final String FILENAME = "Punkt.png";
	
	private static final int zIndex = 100;
	
	private int speed = 10;

	public Punkt(int x, int y) {
		super(x, y, zIndex, true, FILENAME);
	}

	@Override
	public void update(Game game) {
		
	}
	
	public String getType() {
		return "point";
	}
	
}
