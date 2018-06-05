package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Purse.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class Purse extends Uncrossable {

	/** Image Purse */
	Image Purse;

	/**
	 * Purse constructor Initialize the x and y.
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public Purse(int OriginX, int OriginY) {

		this.x = OriginX;
		this.y = OriginY;

		ImageIcon PurseImg = new ImageIcon("../sprite/purse.png");
		Purse = PurseImg.getImage();
	}

	/**
	 * Get image
	 * 
	 * @return Purse
	 */
	public Image getImage() {

		return Purse;

	}

}
