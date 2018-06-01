package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster_1 extends MobileElements{
	
	Image Monster_1;
	
	public Monster_1(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster1 = new ImageIcon("C:\\Users\\fifib\\Desktop\\sprite\\monster_1.png");
		Monster_1 = Monster1.getImage();
	}
	
	public Image getImage(){
		return Monster_1;
	}


}
