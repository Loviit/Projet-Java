package model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Door {
	
	int x,y;
	Image Door;
	
	
	String State = "CLOSED";
	ImageIcon DoorClosed = new ImageIcon("C:\\Users\\fifib\\Desktop\\sprite\\gate_closed.png");
	ImageIcon DoorOpen = new ImageIcon("C:\\Users\\fifib\\Desktop\\sprite\\gate_open.png");
	
	public Door (int OriginX, int OriginY) {
		x = OriginX;
		y = OriginY;
	}

	public int getX() {
		return x;
	}

	

	public int getY() {
		return y;
	}

	public Rectangle getBounds() {
		Rectangle HitBox = new Rectangle(x,y,32,32);
		return HitBox;
	}

	public String getState() {
		return State;
	}

	public void setState(String newstate) {
		this.State = newstate;
	}
	
	public Image getImage(){
		if(State == "CLOSED"){
			Door = DoorClosed.getImage();
		}
		else if (State == "OPEN"){
			Door = DoorOpen.getImage();
		}
		return Door;

	}
	

}
