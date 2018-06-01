package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster_4 extends MobileElements{
	
	Image Monster_4;
	
	public Monster_4(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster4 = new ImageIcon("../sprite/monster_4.png");
		Monster_4 = Monster4.getImage();
	}
	
	public Image getImage(){
		return Monster_4;
	}


}
