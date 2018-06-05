package model.mobile;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>The Class LorannMobile allows the mobility of the main character.</h1>
 *
 * @author Alyssa BINARD
 * @version 1.0
 * @see KeyEvent
 * @see ArrayList
 * @see List
 */
public class LorannMobile extends Sprite {
	/** The dx. */
	private int dx;
	/** The dy. */
	private int dy;
	/** The valeur receives Methode. */
	int valeur = Methode();
	/** The list Missiles. */
	private List<Missile> missiles;

	/**
	 * Instantiates a new LorannMobile.
	 * 
	 * @param x
	 * @param y
	 */
	public LorannMobile(int x, int y) {
		super(x, y);
		int valeur = Methode();
		loadImage(valeur);
		initLorannMobile();
	}

	/**
	 * load the Image.
	 * 
	 * @param valeur
	 */
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

	/**
	 * Initialize Lorann Mobile.
	 */
	private void initLorannMobile() {

		missiles = new ArrayList<>();
	}

	/**
	 * Transition to know the direction.
	 * 
	 * @return valor.
	 */
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

	/**
	 * The move changes the coordinates of the sprite.
	 */
	public void move() {
		x += dx;
		y += dy;
	}

	/**
	 * Get the missiles. Called from the Board class
	 * 
	 * @return missiles
	 */
	public List<Missile> getMissiles() {
		return missiles;
	}

	/**
	 * KeyPressed
	 * 
	 * @param e
	 */
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
		}

		if (key == KeyEvent.VK_LEFT) {
			dx = -32;
			System.out.println("gauche !!!");
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 32;
			System.out.println("droite !!!");
		}

		if (key == KeyEvent.VK_UP) {
			dy = -32;
			System.out.println("en haut!!!");
		}

		if (key == KeyEvent.VK_DOWN) {
			dy = 32;
			System.out.println("en bas !!!");
		}
	}

	/**
	 * Creates a new Missile object and adds it to the list of missiles.
	 */
	public void fire() {
		missiles.add(new Missile(x, y, direction()));
	}

	/**
	 * Released the key.
	 * 
	 * @param e
	 */
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

	/**
	 * Give the direction.
	 * 
	 * @return
	 */
	public int direction() {
		if (dx < 0) {
			return 1;
		}
		if (dx > 0) {
			return 2;
		}
		if (dy < 0) {
			return 3;
		}
		if (dy > 0) {
			return 4;
		}
		return 6;
	}
}
