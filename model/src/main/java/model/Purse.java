package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Purse extends Uncrossable {
	
	Image Purse;
	
	public Purse(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon PurseImg = new ImageIcon("../sprite/purse.png");
		Purse = PurseImg.getImage();
	}
	
	
	public Image getImage() {
		
		return Purse;
		
	}
	

}
