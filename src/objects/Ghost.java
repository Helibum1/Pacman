package objects;

import pacman.Game;

public class Ghost extends ImageObject {
	
	private static final String PicPath = "Ghost.png";
	
	private static final int zIndex = 100;
	
	private int speed = 6;
	
	private static int PacmanX;
	
	private static int PacmanY;
	
	private int x;
	
	private int y;
	
	public Ghost(int x, int y){
		super(x, y, zIndex, true, PicPath);
		this.x = x;
		this.y = y;
	}

	@Override
	public void update(Game game){
		thisCoords();
		if(PacmanX > x) {
			move(speed, 0, game.getObjectsToRender());
		}
		
		if(PacmanX < x) {
			move(-speed, 0, game.getObjectsToRender());
		}
		
		if(PacmanY > y) {
			move(0, speed, game.getObjectsToRender());
		}
		
		if(PacmanY < y) {
			move(0, -speed, game.getObjectsToRender());
		}
	}
	
	public String getType(){
		return "ghost";
	}
	
	public void thisCoords() {
		x = this.getX();
		y = this.getY();
	}

	public static void sendCoords(int x2, int y2) {
		PacmanX = x2;
		PacmanY = y2;
		
	}
	
}
