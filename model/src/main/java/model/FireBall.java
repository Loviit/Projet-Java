package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Fireball.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class FireBall extends MobileElements {
	/** Image fireball */
	Image Fireball;
	/** Fireball type */
	int FireBall_Type = 0;

	/** load image fireball 1 */
	ImageIcon FireBall1 = new ImageIcon("../sprite/fireball_1.png");
	/** load image fireball 2 */
	ImageIcon FireBall2 = new ImageIcon("../sprite/fireball_2.png");
	/** load image fireball 3 */
	ImageIcon FireBall3 = new ImageIcon("../sprite/fireball_3.png");
	/** load image fireball 4 */
	ImageIcon FireBall4 = new ImageIcon("../sprite/fireball_4.png");
	/** load image fireball 5 */
	ImageIcon FireBall5 = new ImageIcon("../sprite/fireball_5.png");

	/**
	 * FireBall constructor Initialize the x and y
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public FireBall(int OriginX, int OriginY) {
		x = OriginX;
		y = OriginY;

		ImageIcon Fire_ball = new ImageIcon("../sprite/fireball_1.png");
		Fireball = Fire_ball.getImage();
	}

	/**
	 * Get Image
	 * 
	 * @return Fireball
	 */
	public Image getImage() {
		switch (FireBall_Type) {

		case 1:
			Fireball = FireBall1.getImage();
			break;

		case 2:
			Fireball = FireBall2.getImage();
			break;

		case 3:
			Fireball = FireBall3.getImage();
			break;

		case 4:
			Fireball = FireBall4.getImage();
			break;

		case 5:
			Fireball = FireBall5.getImage();
			break;
		}
		return Fireball;
	}

}
