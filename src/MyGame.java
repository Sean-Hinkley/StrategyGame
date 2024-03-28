

import java.awt.Color;
import Screens.Screen;
import Screens.StartScreen;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public class MyGame extends Game  {
    public static final String TITLE = "Platformer";
    public static final int SCREEN_WIDTH = 1700;
    public static final int SCREEN_HEIGHT = 900;
    
    public Screen thisScreen;
    public StartScreen start;


    public MyGame() 
    {
    	start = new StartScreen();
    	thisScreen = start;
    }
    
    public void update() 
    {
    	thisScreen.update();
    }
    
    public void draw(Graphics pen) 
    {
    	thisScreen.draw(pen);
    }
        
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) 
    {

    }

    @Override
    public void keyReleased(KeyEvent ke) {}

    @Override
    public void mouseClicked(MouseEvent ke) {thisScreen.mouseClicked(ke);}

    @Override
    public void mousePressed(MouseEvent me) {}
    
    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
        
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
}