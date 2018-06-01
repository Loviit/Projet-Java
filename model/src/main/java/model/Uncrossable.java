package model;

import java.awt.Rectangle;

/**
 * <b> Uncrossable is a class that manages the hitbox of objects that can not be crossed. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Uncrossable {

	/**
	 * x and y coordinates of the displayed objects
	 */
	int x,y;
	
	/**
	 * Returns the hitbox of the object
	 * 
	 * @return hitbox of the object
	 */
	public Rectangle getBounds(){
		Rectangle HitBox = new Rectangle (x,y,32,32);
		return HitBox;
	}
	/**
	 * Returns the X coordinate of the object
	 * 
	 * @return X coordinate of the object
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Returns the Y coordinate of the object
	 * 
	 * @return Y coordinate of the object
	 */
	public int getY() {
		return y;
	}
}
