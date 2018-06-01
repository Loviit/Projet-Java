package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bone_V extends Walls{

	Image BoneV;
	
	public Bone_V(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneVImg = new ImageIcon("../sprite/vertical_bone.png");
		BoneV = BoneVImg.getImage();
	}
	
	
	public Image getImage() {
		
		return BoneV;
		
	}
	
}
