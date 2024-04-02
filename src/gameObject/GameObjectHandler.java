package gameObject;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public class GameObjectHandler {
		private GameObject[][] gameArr;
		
		public GameObjectHandler(int layers, int maxObj) {
			//a handler can be used to keep track of a lot of gameobjects like a tilemap or an inventory system
			//the GameObjectHandler is what will be used to add unique code to execute during different events in game
			// every handler has a layer param to split up the rendering to get a nicer format and another param as the amount of objects and will have a memory cap that can be altered
			gameArr = new GameObject[layers][maxObj];
		}
		
		public void update() {
		}
		
		public void draw(Graphics pen) {
			
		}
		
		public void keyTyped(KeyEvent ke) {
			
		}


	    public void keyPressed(KeyEvent ke) 
	    {

	    }

	 
	    public void keyReleased(KeyEvent ke) {}


	    public void mouseClicked(MouseEvent ke) {}


	    public void mousePressed(MouseEvent me) {}

	    public void mouseReleased(MouseEvent me) {}

	    public void mouseEntered(MouseEvent me) {}

	  
	    public void mouseExited(MouseEvent me) {}
}
