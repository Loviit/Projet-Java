package model.mobile;

import model.MobileLorann;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
//import controller.ControllerCommand;
//import java.awt.Image;
//import javax.swing.ImageIcon;


public class LorannMobile extends Sprite {
	private int dx;
	private int dy;
	int valeur = Methode();
	// loadImage(valeur);
	private List<Missile> missiles;
	// public int valeur = 0;
	public int d = 0;

	MobileLorann lorann;

	/**
	 * Instantiates a new LorannMobile.
	 * @param x
	 * @param y
	 */
	public LorannMobile(int x, int y) {
		super(x, y);
		int valeur = Methode();
		loadImage(valeur);
		initLorannMobile();
	}

	public void loadImage(int valeur) {
		if (valeur == 1) {
			loadImage("../sprite/lorann_r.png");
			getImageDimensions();
		}
		if (valeur == 2) {
			loadImage("../sprite/lorann_l.png");
			getImageDimensions();
		}
		if (valeur == 3) {
			loadImage("../sprite/lorann_u.png");
			getImageDimensions();
		}

		if (valeur == 4) {
			loadImage("../sprite/lorann_b.png");
			getImageDimensions();
		}
		if (valeur == 5) {
			loadImage("../sprite/lorann.gif");
			getImageDimensions();
		}
	}

	private void initLorannMobile() {

		missiles = new ArrayList<>();

		/*
		 * if (valeur == 0) { loadImage("C:\\Users\\fifib\\Downloads\\lorann.gif");
		 * getImageDimensions(); } if (valeur == 1) {
		 * loadImage("../sprite/lorann_b.png"); getImageDimensions(); } if (valeur == 2)
		 * { loadImage("../sprite/lorann_l.png"); getImageDimensions(); } if (valeur ==
		 * 3) { loadImage("../sprite/lorann_u.png"); getImageDimensions(); } if (valeur
		 * == 4) { loadImage("../sprite/lorann_r.png"); getImageDimensions(); }
		 */

		// lorann = new MobileLorann(x*32, y*32);
		// loadImage("../sprite/lorann_b.png");
		// getImageDimensions();
	}

	public int Methode() {
		if (dx == 32) {
			return 1;
		}
		if (dx == -32) {
			return 2;
		}
		if (dy == -32) {
			return 3;
		}
		if (dy == 32) {
			return 4;
		}
		if (dx == 0 && dy == 0) {
			return 5;
		}
		return 0;

	}

	public void move() {
		x += dx;
		y += dy;
	}
	

	public List<Missile> getMissiles() {
		return missiles;
	}

	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		/*
		 * switch (key) { case KeyEvent.VK_SPACE : fire(); valeur=0; break; case
		 * KeyEvent.VK_LEFT: fire(); valeur=2; break; case KeyEvent.VK_RIGHT: fire();
		 * valeur=4; break; case KeyEvent.VK_UP: fire(); valeur=3; break; case
		 * KeyEvent.VK_DOWN: fire(); valeur=1; break; default: break; }
		 */

		if (key == KeyEvent.VK_SPACE) {
			fire();
			System.out.println("FEU !!!");
		//	d = 0;
		}

		if (key == KeyEvent.VK_LEFT) {
			dx = -32;
			System.out.println("gauche !!!");
		//	d = 2;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 32;
			System.out.println("droite !!!");
		//	d = 4;
		}

		if (key == KeyEvent.VK_UP) {
			dy = -32;
			System.out.println("en haut!!!");
		//	d = 3;
		}

		if (key == KeyEvent.VK_DOWN) {
			dy = 32;
			System.out.println("en bas !!!");
		//	d = 1;
		}
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

		public void fire() { 
			missiles.add(new Missile(x, y,direction())); 
		}

	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_UP) {
			dy = 0;
		}

		if (key == KeyEvent.VK_DOWN) {
			dy = 0;
		}
	}

	public int direction() {
	        if(dx<0) {
	            return 1;
	        }
	        if(dx>0) {
	            return 2;
	        }
	        if(dy<0) {
	            return 3;
	        }
	        if(dy>0) {
	            return 4;
	        }
	        return 6;
	    }
}



