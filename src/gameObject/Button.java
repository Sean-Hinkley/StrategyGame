package gameObject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public class Button extends GameObject{
	public int w;
	public int h;
	public Button(int x, int y, int w, int h, String name) {
		super(x,y,false, name);
		this.h = h;
		this.w = w;
	}
	
	
	public void update() {
		
	}
	
	public void draw(Graphics pen) {
		pen.setColor(new Color(255,0,255));
		pen.fillRect(this.objX,this.objY, w,h);
	}
	
	
	public void mouseClicked(MouseEvent ke) {
		int my = ke.getY();
		int mx = ke.getX();
		
		if(mx-8>=this.objX && mx-8<this.objX+this.w && my-32>=this.objY && my-32<=objY+this.h) {
			buttonAction();
		}
	}
	
	public void buttonAction() {
		System.out.println("Clicked!");
	}
}
