package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Monster_2.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class Monster_2 extends MobileElements {

	/** Image Monster_2 */
	Image Monster_2;

	/**
	 * Monster_2 constructor Initialize the x and y.
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public Monster_2(int OriginX, int OriginY) {
		x = OriginX;
		y = OriginY;

		ImageIcon Monster2 = new ImageIcon("../sprite/monster_2.png");
		Monster_2 = Monster2.getImage();
	}

	/**
	 * Get image
	 * 
	 * @return Monster_2
	 */
	public Image getImage() {
		return Monster_2;
	}

}
