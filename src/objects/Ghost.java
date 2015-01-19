package objects;

import pacman.Game;

public class Ghost extends ImageObject {
	
	private static final String PicPath = "Punkt.png";
	
	private static final int zIndex = 100;
	
	private int speed = 5;
	
	private static int PacmanX;
	
	private static int PacmanY;
	
	private int x;
	
	private int y;
	
	public Ghost(int x, int y){
		super(x, y, zIndex, true, PicPath);
		System.out.println("asdfasdfsadfsadfsadfasdfasdfasdfsadfasdfasdfsafsadfasdfasdfsadfsadf");
		this.x = x;
		this.y = y;
	}
	
	public static void sentCoords(int x, int y) {
		PacmanX = x;
		PacmanY = y;
	}

	@Override
	public void update(Game game){
		if(PacmanX > x) {
			move(speed, 0, game.getObjectsToRender());
			x = x + speed;
		}
		
		if(PacmanX < x) {
			move(-speed, 0, game.getObjectsToRender());
			x = x - speed;
		}
		
		if(PacmanY > y) {
			move(0, speed, game.getObjectsToRender());
			y = y + speed;
		}
		
		if(PacmanY < y) {
			move(0, -speed, game.getObjectsToRender());
			y = y - speed;
		}
	}
	
	public String getType(){
		return "ghost";
	}
	
}
