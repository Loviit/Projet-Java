package model;

import java.awt.Rectangle;

public class MobileElements {
	
	public int x, y;
	public String Way = "DOWN";
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getWay() {
		return Way;
	}
	public void setWay(String way) {
		this.Way = way;
	}
	
	public Rectangle getBounds() { //pour les collisions
		Rectangle HitBox = new Rectangle(x,y,32,32);
		return HitBox;
	}
	
	public void move() {
		
		switch (this.getWay()) 
		{
			case "UP":
				this.setY(getY() - 32 );
				break;
			case "RIGHT":
				this.setX(getX() + 32);
				break;
			case "DOWN":
				this.setY(getY() + 32 );
				break;
			case "LEFT":
				this.setX(getX() - 32 );
				break;
			case "UPRIGHT":
				this.setY(getY() - 32 );
				this.setX(getX() + 32);				
			break;
			case "UPLEFT":
				this.setY(getY() - 32 );
				this.setX(getX() - 32 );				
			break;
			case "DOWNRIGHT":
				this.setX(getX() + 32);
				this.setY(getY() + 32 );
			break;
			case "DOWNLEFT":
				this.setY(getY() + 32 );
				this.setX(getX() - 32 );				
			break;
			default:
				break;
		}
	}
	
	
	/*void moveUp() {
		this.setY(getY() - 32 );
	}

	void moveRight() {
		this.setX(getX() + 32);
	}

	void moveDown() {
		this.setY(getY() + 32 );
	}

	void moveLeft() {
		this.setX(getX() - 32 );
	}
	
	void moveUpRight() {
		this.setY(getY() - 32 );
		this.setX(getX() + 32);
	}

	void moveDownRight() {
		this.setX(getX() + 32);
		this.setY(getY() + 32 );
	}

	void moveDownLeft() {
		this.setY(getY() + 32 );
		this.setX(getX() - 32 );
	}

	void moveUpLeft() {
		this.setY(getY() - 32 );
		this.setX(getX() - 32 );
	}*/
}

