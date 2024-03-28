package Screens;

import java.awt.Graphics;
import java.awt.Color;
import buttonObject.*;
public class StartScreen extends Screen {
	private int action;//action is going to select what to access in terms of screens 
	//1: will run the new game function and create a new instance
	//2: will start the continued game by reading a file
	//3: will open settings menu
	//4: will open developer notes and patches
	public StartScreen() {
		super("StartScreen");
		objs[0] = new Button(50,50,100,500);
		
		
	}
	
	public void update() {

    }
	
	
	public void draw(Graphics pen) {
		pen.setColor(new Color(255,0,255));
		pen.fillRect(50,50, 100,100);
		
    }

}
