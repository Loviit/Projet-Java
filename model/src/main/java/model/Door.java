package model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Door allows the initialization and downloading of Door.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class Door {
	/** the x and y */
	int x, y;
	/** The door */
	Image Door;

	/** the state closed */
	String State = "CLOSED";
	/** load the image door closed */
	ImageIcon DoorClosed = new ImageIcon("../sprite/gate_closed.png");
	/** laod the image door open */
	ImageIcon DoorOpen = new ImageIcon("../sprite/gate_open.png");

	/**
	 * Door Initialize the x and y.
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public Door(int OriginX, int OriginY) {
		x = OriginX;
		y = OriginY;
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
	 * Get y
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * To avoid collisions
	 * 
	 * @return HitBox
	 */
	public Rectangle getBounds() {
		Rectangle HitBox = new Rectangle(x, y, 32, 32);
		return HitBox;
	}

	/**
	 * Get State
	 * 
	 * @return State
	 */
	public String getState() {
		return State;
	}

	/**
	 * Set State
	 * 
	 * @param newstate
	 */
	public void setState(String newstate) {
		this.State = newstate;
	}

	/**
	 * Get image
	 * 
	 * @return Door
	 */
	public Image getImage() {
		if (State == "CLOSED") {
			Door = DoorClosed.getImage();
		} else if (State == "OPEN") {
			Door = DoorOpen.getImage();
		}
		return Door;

	}

}
