package buttonObject;
import gameObject.GameObject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public class Button extends GameObject{
	int w;
	int h;
	public Button(int x, int y, int w, int h) {
		super(x,y,false);
		this.h = h;
		this.w = w;
	}
	
	
	public void update() {
		
	}
	
	public void draw(Graphics pen) {
		pen.setColor(new Color(255,0,255));
		pen.fillRect(50,50, 100,100);
	}
	
	
	public void mouseClicked(MouseEvent ke) {
		int my = ke.getY();
		int mx = ke.getX();
		
		if(mx>=this.objX && mx<this.objX+this.w && my>=this.objY && my<=objY+this.h) {
			buttonAction();
		}
	}
	
	public void buttonAction() {
		System.out.println("Hello");
	}
}
