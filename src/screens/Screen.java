package screens;

import gameObject.GameObject;
import gameObject.Button;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public abstract class Screen {
    protected String title;
    public GameObject[] objs;

    public Screen(String title) {
        this.title = title;
        objs = new GameObject[100];
        
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

    
    public void mouseClicked(MouseEvent ke) {}

    
    public void mousePressed(MouseEvent me) {}
    
    
    public void mouseReleased(MouseEvent me) {}

    
    public void mouseEntered(MouseEvent me) {}

    
    public void mouseExited(MouseEvent me) {}
    
}
