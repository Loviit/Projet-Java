package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Monster_1.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */
public class Monster_1 extends MobileElements{
	
	/** Image Monster_1 */
	Image Monster_1;
	
	/**
	 * Monster_1 constructor
	 * Initialize the x and y.
	 * @param OriginX
	 * @param OriginY
	 */
	public Monster_1(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster1 = new ImageIcon("../sprite/monster_1.png");
		Monster_1 = Monster1.getImage();
	}
	
	/**
	 * Get image
	 * 
	 * @return Monster_1
	 */
	public Image getImage(){
		return Monster_1;
	}


}
