package objects;

import java.awt.Graphics;

	public class Wall extends RenderObject {
		
		private static final int zIndex = 100;
		
		public Wall(int x, int y) {
			super(x, y, zIndex, true);
		}

		@Override
		public int getWidth() {
			// TODO Auto-generated method stub
			return 500;
		}

		@Override
		public int getHeight() {
			// TODO Auto-generated method stub
			return 220;
		}

		@Override
		public void render(Graphics g) {
			// TODO Auto-generated method stub
			
		}
		
		public String getType(){
			return "wall";
		}
		
}
