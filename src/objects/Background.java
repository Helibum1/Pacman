package objects;

public class Background extends ImageObject {
	
	public static final String PicPath = "PacmanMapMitHintergrund.png";
	
	public static final int zIndex = 0;
	
	public Background(int x, int y){
		super(x, y, zIndex, false, PicPath);
	}
	
}
