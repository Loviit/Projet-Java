package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bone extends Walls{

	Image Bone;
	
	public Bone(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneSImg = new ImageIcon("C:\\Users\\fifib\\Desktop\\sprite\\bone.png");
		Bone = BoneSImg.getImage();
	}
	
	
	public Image getImage() {
		
		return Bone;
		
	}
	
}
