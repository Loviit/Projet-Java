package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bone_H extends Walls{

	Image BoneH;
	
	public Bone_H(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneHImg = new ImageIcon("../sprite/horizontal_bone.png");
		BoneH = BoneHImg.getImage();
	}
	
	
	public Image getImage() {
		
		return BoneH;
		
	}
	
}
