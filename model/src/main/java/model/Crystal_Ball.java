package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Crystal_Ball extends Uncrossable {
	
Image CrystalBall;
	
	public Crystal_Ball(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon CrystalBallImg = new ImageIcon("C:\\Users\\fifib\\Desktop\\sprite\\crystal_ball.png");
		CrystalBall = CrystalBallImg.getImage();
	}
	
	
	public Image getImage() {
		
		return CrystalBall;
		
	}
	
}
