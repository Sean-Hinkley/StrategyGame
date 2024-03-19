import java.io.*;
import screen.StartScreen;
import screen.Screen;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class MyGame extends Game  {
    public static final String TITLE = "Platformer";
    public static final int SCREEN_WIDTH = 1700;
    public static final int SCREEN_HEIGHT = 900;
    
    Screen rendering;
    StartScreen startScreen;


    public MyGame() 
    {
    	startScreen = new StartScreen();
    	
    	rendering = startScreen;
    }
    
    public void update() 
    {
    	rendering.update();
    }
    
    public void draw(Graphics pen) 
    {
    	rendering.draw(pen);
    }
        
    @Override
    public void keyTyped(KeyEvent ke) {rendering.keyTyped(ke);}

    @Override
    public void keyPressed(KeyEvent ke) 
    {
    	rendering.keyPressed(ke);
    }

    @Override
    public void keyReleased(KeyEvent ke) {rendering.keyReleased(ke);}

    @Override
    public void mouseClicked(MouseEvent ke) {rendering.mouseClicked(ke);}

    @Override
    public void mousePressed(MouseEvent me) {rendering.mousePressed(me);}
    
    @Override
    public void mouseReleased(MouseEvent me) {rendering.mouseReleased(me);}

    @Override
    public void mouseEntered(MouseEvent me) {rendering.mouseEntered(me);}

    @Override
    public void mouseExited(MouseEvent me) {rendering.mouseExited(me);}
        
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
}