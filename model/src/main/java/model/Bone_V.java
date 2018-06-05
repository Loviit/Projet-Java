package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Bone_V allows the initialization and downloading of Bone_V.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */

public class Bone_V extends Walls {

	/** The image Bone_V */
	Image Bone_V;

	/**
	 * The initialize the Bone_V. Load image.
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public Bone_V(int OriginX, int OriginY) {

		this.x = OriginX;
		this.y = OriginY;

		ImageIcon BoneVImg = new ImageIcon("../sprite/vertical_bone.png");
		Bone_V = BoneVImg.getImage();
	}

	/**
	 * Get Image.
	 * 
	 * @return Bone_V
	 */
	public Image getImage() {

		return Bone_V;

	}

}
