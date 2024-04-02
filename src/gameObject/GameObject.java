package gameObject;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public abstract class GameObject {
	public int objX;
	public int objY;
	private boolean solid;
	private String Name;
	
	
	public GameObject(int x, int y, boolean sol, String objName) {
		objX = x;
		objY = y;
		solid = sol;
		Name = objName;
	}
	
	public void update() {
		
	
	}
	
	
	public void draw(Graphics pen) {
		
	
	}
	
	public String toString() {
		return "Name: " + Name + ", ObjectX: " + objX + ", ObjectY: " + objY; 
	}
	
	

    public void keyTyped(KeyEvent ke) {}


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