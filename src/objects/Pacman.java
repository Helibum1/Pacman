package objects;

import java.awt.event.KeyEvent;
import objects.ImageObject;
import pacman.Game;

public class Pacman extends ImageObject {
	
	private static final String PicPath = "Pacman.png";
	
	private static final int zIndex = 100;
	
	private int speed = 6;
	
	private String LastMove = "left";
	
	public Pacman(int x, int y){
		super(x, y, zIndex, true, PicPath);
	}
	
	@Override
	public void update(Game game){
		
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_A) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_LEFT) || LastMove == "left") {
			
			move(-speed, 0, game.getObjectsToRender());
			x = x - speed;
			LastMove = "left";
		}
		
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_D) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_RIGHT) || LastMove == "right") {
			
			move(speed, 0, game.getObjectsToRender());
			x = x + speed;
			LastMove = "right";
		}
		
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_S) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_DOWN) || LastMove == "down") {
			
			move(0, speed, game.getObjectsToRender());
			y = y + speed;
			LastMove = "down";
		}
		
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_W) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_UP) || LastMove == "up") {
			
			move(0, -speed, game.getObjectsToRender());
			y = y + speed;
			LastMove = "up";
		}
	}
	
	public String getType() {
		return "pacman";
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}
