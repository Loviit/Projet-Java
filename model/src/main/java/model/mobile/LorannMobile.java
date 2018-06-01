package model.mobile;

import model.MobileLorann;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


public class LorannMobile extends Sprite {
	private int dx;
	private int dy;
	private List<Missile> missiles;
	
	MobileLorann lorann;

	public LorannMobile(int x, int y) {
		super(x, y);

		initLorannMobile();
	}

	private void initLorannMobile() {

		missiles = new ArrayList<>();
		
	//	lorann = new MobileLorann(x*32, y*32);
		loadImage("../sprite/lorann_b.png");
		getImageDimensions();
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

		if (key == KeyEvent.VK_SPACE) {
			fire();
			System.out.println("FEU !!!");
		}

		if (key == KeyEvent.VK_LEFT) {
			dx = -1;
			System.out.println("gauche !!!");
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 1;
			System.out.println("droite !!!");
		}

		if (key == KeyEvent.VK_UP) {
			dy = -1;
			System.out.println("en haut!!!");
		}

		if (key == KeyEvent.VK_DOWN) {
			dy = 1;
			System.out.println("en bas !!!");
		}
	}

	public void fire() {
		missiles.add(new Missile(x, y));
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
}
