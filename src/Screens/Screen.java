package Screens;
import gameObject.GameObject;
import buttonObject.Button;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public abstract class Screen {
    protected String title;
    public GameObject[] objs;

    public Screen(String title) {
        this.title = title;
        objs = new GameObject[100];
        objs[0] = new Button(50,50,100,500);
        
    }

    public void update() {

    }

    public void draw(Graphics pen) {
    	for(GameObject x : objs) {
    		x.draw(pen);
    	}

    }

    public void hide() {

    }

    public void show() {

    }
    
    public void keyTyped(KeyEvent ke) {}

    
    public void keyPressed(KeyEvent ke) 
    {

    }

    
    public void keyReleased(KeyEvent ke) {}

    
    public void mouseClicked(MouseEvent ke) {objs[0].mouseClicked(ke);}

    
    public void mousePressed(MouseEvent me) {}
    
    
    public void mouseReleased(MouseEvent me) {}

    
    public void mouseEntered(MouseEvent me) {}

    
    public void mouseExited(MouseEvent me) {}
    
}
