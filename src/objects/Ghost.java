package objects;

import pacman.Game;

public class Ghost extends ImageObject {
	
	private static final String PicPath = "Pacman.png";
	
	private static final int zIndex = 100;
	
	private int speed = 5;
	
	private String LastMove = "left";
	
	public Ghost(int x, int y){
		super(x, y, zIndex, true, PicPath);
	}

	@Override
	public void update(Game game){
		
	}
	
}
