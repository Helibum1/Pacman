package objects;

import java.awt.event.KeyEvent;
import objects.ImageObject;
import pacman.Game;

public class Pacman extends ImageObject {
	
	private static final String PicPath = "Pacman.png";
	
	private static final int zIndex = 100;
	
	private int speed = 10;
	
	public Pacman(int x, int y){
		super(x, y, zIndex, true, PicPath);
	}
	
	@Override
	public void update(Game game){
		
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_A) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_LEFT)) {
			
			move(-speed, 0, game.getObjectsToRender());
		}
		
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_D) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_RIGHT)) {
			
			move(speed, 0, game.getObjectsToRender());
		}
		
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_S) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_DOWN)) {
			
			move(0, speed, game.getObjectsToRender());
		}
		
		if (game.getInputHandler().isKeyPressed(KeyEvent.VK_W) ||
				game.getInputHandler().isKeyPressed(KeyEvent.VK_UP)) {
			
			move(0, -speed, game.getObjectsToRender());
		}
	}
	
	public String getType() {
		return "pacman";
	}
}
