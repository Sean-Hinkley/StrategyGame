package gameObject;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public class GameObjectList {
	private Link head;//the first element in the list
	private Link tail;//the last object in the list
	public int length;//this is a instance variable so you can get the size of the list anytime
	
	public GameObjectList() {
		length = 0;
	}
	
	public void add(GameObject obj, int index) {
		if(head == null) {
			head = new Link(obj);
			length++;
			
		}
		 else {
			Link tmp = head;
			int in = 0;
			
			while(tmp.getNext() != null && in < index) {
				if(in > 0) {
					
					tmp = tmp.getNext();
				}
				
				in++;
				
				
			}

			Link tmp1 = tmp.getNext();
			
			Link tmp2 = new Link(obj);
			tmp2.linkNext(tmp1);
			tmp.linkNext(tmp2);
			

		}
		

	}
	
	public void add(GameObject obj) {
		if(head == null) {
			head = new Link(obj);
			length++;
			
			
			
		} else {
			Link tmp = head;
			
			while(tmp.getNext() != null) {
				tmp = tmp.getNext();
				
				
				
			}
			tmp.linkNext(new Link(obj));
			
			
			length++;
		}
	}
	
	public void set(GameObject obj, int index) {
		if(head == null) {
			head = new Link(obj);
			length++;
			
		}
		 else {
			Link tmp = head;
			int in = 0;
			
			while(tmp.getNext() != null && in < index) {
				
					
				tmp = tmp.getNext();
				
				
				in++;
				
				
			}

			tmp.changeObj(obj);			

		}
	}
	
	public void remove(int index) {
		
		Link tmp = head;
		Link tmp1 = tmp.getNext().getNext();
		int in = 0;
		
		while(tmp.getNext() != null && in < index) {
			if( in > 0)
			{
				tmp = tmp.getNext();
				tmp1 = tmp1.getNext();
			}
			
			in++;
			
			
		}
		
		tmp.linkNext(tmp1);
		
		
		
		

				

	}
	
	public void keyTyped(KeyEvent ke) {}


    public void keyPressed(KeyEvent ke) 
    {

    }

 
    public void keyReleased(KeyEvent ke) {}


    public void mouseClicked(MouseEvent ke) {
    	Link tmp = head; 
		GameObject tmp1;
		while(tmp.getNext() != null) {
			tmp1 = tmp.getObj();
			tmp1.mouseClicked(ke);
			tmp = tmp.getNext();
		}
    }


    public void mousePressed(MouseEvent me) {}

    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {}

  
    public void mouseExited(MouseEvent me) {}
	
	
	public void update() {
		
	}
	
	public void draw(Graphics pen) {
		Link tmp = head; 
		GameObject tmp1;
		while(tmp.getNext() != null) {
			tmp1 = tmp.getObj();
			tmp1.draw(pen);
			tmp = tmp.getNext();
		}
	}
	
	public String toString() {
		Link tmp = head;
		String result = ""; 
		while(tmp != null) {
			result += ", ";
			result += tmp.toString();
			tmp = tmp.getNext();
		}
		return "[" + result.substring(2) + "]";
	}
	public class Link {
		private GameObject obj;
		private Link next;
		public Link(GameObject obj) {
			this.obj = obj;
		}
		
		public void linkNext(Link objs) {
			//makes a pointer to the next object
			next = objs;
			
		}
		
		
		public Link getNext() {
			//returns the pointer to the next object
			return next;
		}
		
		public GameObject getObj() {
			//return the pointer to the gameObject
			return obj;
		}
		
		public String toString() {
			String result = "";
			result += "GameObject: " + obj.toString();
			
			return result;
		}
		
		public void changeObj(GameObject obs) {
			obj = obs;
		}
	}
}
