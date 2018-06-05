package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Bone allows the initialization and downloading of Bone.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */

public class Bone extends Walls {

	/** The image Bone */
	Image Bone;

	/**
	 * The initialize the Bone. Load image.
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public Bone(int OriginX, int OriginY) {

		this.x = OriginX;
		this.y = OriginY;

		ImageIcon BoneSImg = new ImageIcon("../sprite/bone.png");
		Bone = BoneSImg.getImage();
	}

	/**
	 * Get Image.
	 * 
	 * @return Bone
	 */
	public Image getImage() {

		return Bone;

	}

}
