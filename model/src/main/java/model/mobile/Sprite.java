package model.mobile;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * <h1>The Class Sprite give different Sprite.</h1>
 *
 * @author Alyssa BINARD
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */

public class Sprite {

	/** The x. */
	protected int x;
	/** The y. */
	protected int y;
	/** The width. */
	protected int width;
	/** The height. */
	protected int height;
	/** The visible. */
	protected boolean visible;
	/** The image. */
	protected Image image;

	/**
	 * Instantiates a Sprite
	 * 
	 * @param x
	 * @param y
	 */
	public Sprite(int x, int y) {

		this.x = x;
		this.y = y;
		visible = true;
	}

	/**
	 * Get Image with loadImage.
	 * 
	 * @param imageName
	 */
	protected void loadImage(String imageName) {

		ImageIcon ii = new ImageIcon(imageName);
		image = ii.getImage();
	}

	/**
	 * Get Image Dimensions
	 */
	protected void getImageDimensions() {

		width = image.getWidth(null);
		height = image.getHeight(null);
	}

	/**
	 * Get Image.
	 * 
	 * @return image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * Get X
	 * 
	 * @return X
	 */
	public int getX() {
		return x;
	}

	/**
	 * Get Y.
	 * 
	 * @return Y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Booelan isVisible
	 * 
	 * @return visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * Set visible
	 * 
	 * @param visible
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
}