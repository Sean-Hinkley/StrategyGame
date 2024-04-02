package startScreen;
import java.awt.Graphics;
import java.awt.Color;
import gameObject.*;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public class StartScreenHandler {
	private Button NewGame;
	private GameObject[] objArr;
	private GameObjectList x;
	public StartScreenHandler() {
		
		NewGame = new NewGameButton(50,50,100,500);
		
		
		x = new GameObjectList();
		x.add(new Button(100,200,50,50, "Test1"));
		x.add(new Button(200,100,50,50, "Test3"));
		x.add(new Button(100,100,40,50, "Test2"), 1);
		x.add(new Button(300,200,40,50, "Test4"));
	}
	
	
	public void update() {
		NewGame.update();
	}
	
	public void draw(Graphics pen) {
		
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
	
	public class NewGameButton extends Button {
	
		
		
		
		
		public NewGameButton(int x, int y, int w, int h) {
			super(x,y,w,h, "NewGame");
			
		}
		
		
		
		
		
		
		
	}
}
