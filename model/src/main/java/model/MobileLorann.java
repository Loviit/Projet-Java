package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MobileLorann extends MobileElements {
	
	public static Object Lorann;
	
	
	Image LorannImg;
	ImageIcon LorannDown = new ImageIcon("../sprite/lorann_b.png");
	ImageIcon LorannDownLeft = new ImageIcon("../sprite/lorann_bl.png");
	ImageIcon LorannDownRight = new ImageIcon("../sprite/lorann_br.png");
	ImageIcon LorannRight = new ImageIcon("../sprite/lorann_r.png");
	ImageIcon LorannLeft = new ImageIcon("../sprite/lorann_l.png");
	ImageIcon LorannUp = new ImageIcon("../sprite/lorann_u.png");
	ImageIcon LorannUpLeft = new ImageIcon("../sprite/lorann_ul.png");
	ImageIcon LorannUpRight = new ImageIcon("../sprite/lorann_ur.png");
	
	
	public MobileLorann(int OriginX,int OriginY){
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon Lorann_Img = new ImageIcon("../sprite/lorann.gif");
		LorannImg = Lorann_Img.getImage();
	}
	
/*	
	Méthode permettant d'afficher le bon sprite en fonction du déplacement du personnage.
*/
	public Image getImage(){
		
		switch (this.getWay()) {
		
		case "UP":
			LorannImg = LorannUp.getImage();
		break;
		
		case "UPLEFT":
			LorannImg = LorannUpLeft.getImage();
		break;
		
		case "UPRIGHT":
			LorannImg = LorannUpRight.getImage();
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
		
		case "DOWNLEFT":
			LorannImg = LorannDownLeft.getImage();
		break;
		
		case "DOWNRIGHT":
			LorannImg = LorannDownRight.getImage();
		break;
		
		}
		return LorannImg;
	}

}
