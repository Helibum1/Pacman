package objects;

import java.awt.*;

	public class Wall extends ImageObject {
		
		private static final int zIndex = 100;
		
		private static String PicPath = "Wall.png";
		
		int Width = 25;
		
		int Height = 25;
		
		public Wall(int x, int y) {
			super(x, y, zIndex, true, PicPath);
		}

		@Override
		public int getWidth() {
			// TODO Auto-generated method stub
			return Width;
		}

		@Override
		public int getHeight() {
			// TODO Auto-generated method stub
			return Height;
		}

		@Override
		public void render(Graphics g) {
			// TODO Auto-generated method stub
			g.setColor(Color.blue);
			g.fillRect(x, y, 25, 25);
		}
		
		public String getType(){
			return "wall";
		}
		
}
