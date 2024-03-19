package screen;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public abstract class Screen {
    protected String title;

    public Screen(String title) {
        this.title = title;
    }

    public void update() {

    }

    public void draw(Graphics pen) {

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
