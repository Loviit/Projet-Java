package model;

import java.awt.Rectangle;

/**
 * <h1>The class Uncrossable</h1>
 * 
 * @author Alyssa
 *
 * @version 1.0
 * @see Rectangle
 */
public class Uncrossable {

	/** The x and y */
	int x, y;

	/**
	 * Get the bounds.
	 * 
	 * @return hitbox
	 */
	public Rectangle getBounds() {
		Rectangle HitBox = new Rectangle(x, y, 32, 32);
		return HitBox;
	}

	/**
	 * Get X
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Get Y
	 * 
	 * @return Y
	 */
	public int getY() {
		return y;
	}
}
