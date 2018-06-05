package model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * <h1>The Class Crystal_Ball allows the initialization and downloading of Crystal_Ball.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class Crystal_Ball extends Uncrossable {

	/** Image CrystalBall */
	Image CrystalBall;

	/**
	 * Crystal_ball constructor Initialize the x and y.
	 * 
	 * @param OriginX
	 * @param OriginY
	 */
	public Crystal_Ball(int OriginX, int OriginY) {

		this.x = OriginX;
		this.y = OriginY;

		ImageIcon CrystalBallImg = new ImageIcon("../sprite/crystal_ball.png");
		CrystalBall = CrystalBallImg.getImage();
	}

	/**
	 * Get image
	 * 
	 * @return CrystalBall.
	 */
	public Image getImage() {

		return CrystalBall;

	}

}
