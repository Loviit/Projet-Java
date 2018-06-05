package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Monster_4.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class Monster_4 extends MobileElements {

	/** Image Monster_4 */
	Image Monster_4;

	/**
	 * Monster_4 constructor Initialize the x and y.
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public Monster_4(int OriginX, int OriginY) {
		x = OriginX;
		y = OriginY;

		ImageIcon Monster4 = new ImageIcon("../sprite/monster_4.png");
		Monster_4 = Monster4.getImage();
	}

	/**
	 * Get image
	 * 
	 * @return Monster_4
	 */
	public Image getImage() {
		return Monster_4;
	}

}
