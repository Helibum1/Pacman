package pacman;

import java.util.HashSet;
import java.util.Set;

import ch.ksimlee.it.spaceinvaders.log.Log;

import pacman.InputHandler;
import objects.Background;
import objects.Pacman;
import objects.Punkt;
import objects.RenderObject;
import objects.Wall;

public class Game implements Runnable {
	
private static final int ACTIONS_PER_SECOND = 30;
	
	/** A list of all objects that can be rendered. */
	private final static Set<RenderObject> objectsToRender = new HashSet<RenderObject>();
	
	private final Set<RenderObject> objectsToAdd = new HashSet<RenderObject>();

	public Set<RenderObject> getObjectsToAdd() {
		return objectsToAdd;
	}

	public static Set<RenderObject> getObjectsToRemove() {
		return objectsToRemove;
	}

	private final static Set<RenderObject> objectsToRemove = new HashSet<RenderObject>();

	
	/** The handler that should receive the user input. */
	private final InputHandler inputHandler = new InputHandler();
	
	private final Pacman pacman;
	
	public Game(){
		
		Log.info("Starting a game with " + ACTIONS_PER_SECOND + " actions/second.");
		
		pacman = new Pacman(475, 650);
		
		objectsToRender.add(pacman);
		new LevelInput(this);
		
		/*
		*objectsToRender.add(new Punkt(500,600));
		*
		*objectsToRender.add(new Wall(0,0,25,1000));
		*objectsToRender.add(new Wall(0,0,1000,25));
		*objectsToRender.add(new Wall(75,75,25,200));
		*objectsToRender.add(new Wall(325,75,25,250));
		*objectsToRender.add(new Wall(975,0,1200,25));
		*objectsToRender.add(new Wall(150,100,250,25));
		*
		*objectsToRender.add(new Background(0,0));
		*/
		Log.info("Game initialized");
		
	}
	
	@Override
	public void run() {
		
		while (true) {
			// This loop goes forever, since we don't want our game
			// logic to stop.
			
			// TODO: Add game mechanics here.
			
			// Update all game objects.
			for (RenderObject object : objectsToRender) {
				object.update(this);
			}
			
			objectsToRender.removeAll(objectsToRemove);
			objectsToRender.addAll(objectsToAdd);
			
			objectsToAdd.clear();
			objectsToRemove.clear();
			
			// Update the input state.
			inputHandler.updatedReleasedKeys();
			
			// Delay the next action (iteration of the loop).
			try {
				Thread.sleep((long) (1000.0f/ACTIONS_PER_SECOND));
				
			} catch (InterruptedException e) {
				// We were interrupted, exit the game loop.
				
				Log.error("Caught interruption exception, exiting game loop.");
				e.printStackTrace();
				break;
			}
			
		}
		
	}
	
	public Set<RenderObject> getObjectsToRender() {
		return objectsToRender;
	}

	public InputHandler getInputHandler() {
		return inputHandler;
	}

	public static void addWalls(int x, int y) {
		objectsToRender.add(new Wall(x,y));
		
	}
	
}
