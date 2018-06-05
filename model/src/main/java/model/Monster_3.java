package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Monster_3.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class Monster_3 extends MobileElements {

	/** Image Monster_3 */
	Image Monster_3;

	/**
	 * Monster_3 constructor Initialize the x and y.
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public Monster_3(int OriginX, int OriginY) {
		x = OriginX;
		y = OriginY;

		ImageIcon Monster3 = new ImageIcon("../sprite/monster_3.png");
		Monster_3 = Monster3.getImage();
	}

	/**
	 * Get image
	 * 
	 * @return Monster_3
	 */
	public Image getImage() {
		return Monster_3;
	}
}
