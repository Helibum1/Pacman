package objects;

import java.awt.Graphics;

	public class Wall extends RenderObject {
		
		private static final int zIndex = 100;
		
		int Width = 25;
		
		int Height = 25;
		
		public Wall(int x, int y) {
			super(x, y, zIndex, true);
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
			
		}
		
		public String getType(){
			return "wall";
		}
		
}
