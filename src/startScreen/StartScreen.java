package startScreen;
import java.awt.Graphics;

import screens.Screen;
import gameObject.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public class StartScreen extends Screen {
	public StartScreenHandler startUI;
	
	private int action;//action is going to select what to access in terms of screens 
	//1: will run the new game function and create a new instance
	//2: will start the continued game by reading a file
	//3: will open settings menu
	//4: will open developer notes and patches
	public StartScreen() {
		super("StartScreen");
		startUI = new StartScreenHandler();
		
		
		
	}
	
	public void update() {
		startUI.update();
    }
	
	
	public void draw(Graphics pen) {

		startUI.draw(pen);
    }
	
	public void mouseClicked(MouseEvent ke) {
		startUI.mouseClicked(ke);
	}

}
