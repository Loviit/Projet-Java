package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class MobileLorann.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class MobileLorann extends MobileElements {
	
	/** the Lorann */
	public static Object Lorann;
	
	/** the image Lorann */
	Image LorannImg;
	/** Load the image loranndown */
	ImageIcon LorannDown = new ImageIcon("../sprite/lorann_b.png");
	/** Load the image lorannRight */
	ImageIcon LorannRight = new ImageIcon("../sprite/lorann_r.png");
	/** Load the image lorannLeft */
	ImageIcon LorannLeft = new ImageIcon("../sprite/lorann_l.png");
	/** Load the image lorannUp */
	ImageIcon LorannUp = new ImageIcon("../sprite/lorann_u.png");
	
	/**
	 * Mobile Lorann
	 * Initialize the x and y.
	 * @param OriginX
	 * @param OriginY
	 */
	public MobileLorann(int OriginX,int OriginY){
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon Lorann_Img = new ImageIcon("../sprite/lorann.gif");
		LorannImg = Lorann_Img.getImage();
	}
	
	/**
	 * Method to display the correct sprite according to the character's movement.
	 * @return LorannImg.
	 */
	public Image getImage(){
		
		switch (this.getWay()) {
		
		case "UP":
			LorannImg = LorannUp.getImage();
		break;
		
		case "RIGHT":
			LorannImg = LorannRight.getImage();
		break;
		
		case "LEFT":
			LorannImg = LorannLeft.getImage();
		break;
		
		case "DOWN":
			LorannImg = LorannDown.getImage();
		break;	
		}
		return LorannImg;
	}

}
