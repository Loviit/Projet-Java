package model;

import java.awt.Rectangle;

public class MobileElements {
	/** the x and y */
	public int x, y;
	/** the Way */
	public String Way = "DOWN";
	
	/**
	 * the get x
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * the set x
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * the get y
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * the set y
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * the get way
	 * @return way
	 */
	public String getWay() {
		return Way;
	}
	
	/**
	 * the set way
	 * @param way
	 */
	public void setWay(String way) {
		this.Way = way;
	}
	
	/**
	 *to Avoid collisions
	 */
	public Rectangle getBounds() {
		Rectangle HitBox = new Rectangle(x,y,32,32);
		return HitBox;
	}
	
	/**
	 * move the Element.
	 */
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
			default:
				break;
		}
	}

}

