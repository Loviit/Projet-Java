package model;

import java.awt.Rectangle;


/**
 * <b> The class Wall. </b>
 *  
 * @author Alyssa
 *
 * @version 1.0
 */
public class Walls {
	
	/** x and y  */
	int x, y;
	
	/**
	 * Returns the hitbox of the object
	 * 
	 * @return hitbox
	 */
	public Rectangle getBounds() {
		Rectangle HitBox = new Rectangle(x, y, 32, 32);
		return HitBox;
	}
	
	/**
	 * Returns the X coordinate of the object
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Returns the Y coordinate of the object
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
}
