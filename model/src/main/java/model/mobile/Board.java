package model.mobile;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * <h1>The Class Board give a Board to test the movements.</h1>
 *
 * @author Alyssa BINARD
 * @version 1.0
 * @see Color
 * @see Graphics
 * @see Graphics2D
 * @see Toolkit
 * @see ActionEvent
 * @see ActionListener
 * @see KeyAdapter
 * @see KeyEvent
 * @see List
 * @see JPanel
 * @see Timer
 */
public class Board extends JPanel implements ActionListener {

	/** The serialVersionUID */
	private static final long serialVersionUID = -8246000947640347114L;
	/** The CRAFT X */
	private final int ICRAFT_X = 40;
	/** The CRAFT Y */
	private final int ICRAFT_Y = 60;
	/** The DELAY */
	private final int DELAY = 150;
	/** The timer X */
	private Timer timer;
	/** The Lorann Mobile */
	private LorannMobile loranMobile;

	/**
	 * Instantiates a new Board.
	 */
	public Board() {

		initBoard();
	}

	/**
	 * Initialized the Board.
	 */
	private void initBoard() {

		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);

		loranMobile = new LorannMobile(ICRAFT_X, ICRAFT_Y);

		timer = new Timer(DELAY, this);
		timer.start();
	}

	/**
	 * (non-Javadoc)
	 * Paint component.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		doDrawing(g);

		Toolkit.getDefaultToolkit().sync();
	}

	/**
	 * Dranwing the windows.
	 * @param g
	 */
	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g2d.drawImage(loranMobile.getImage(), loranMobile.getX(), loranMobile.getY(), this);

		List<Missile> missiles = loranMobile.getMissiles();

		for (Missile missile : missiles) {

			g2d.drawImage(missile.getImage(), missile.getX(), missile.getY(), this);
		}
	}

	/**
	 * Update Missile and Lorann.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		updateMissiles();
		updateLoranMobile();

		int valeur1 = loranMobile.Methode();
		loranMobile.loadImage(valeur1);

		repaint();
	}

	/**
	 * Update Missiles.
	 */
	private void updateMissiles() {

		List<Missile> missiles = loranMobile.getMissiles();

		for (int i = 0; i < missiles.size(); i++) {

			Missile missile = missiles.get(i);
			if (missile.isVisible()) {

				missile.move(loranMobile.direction());
			} else {

				missiles.remove(i);
			}
		}
	}

	/**
	 * Update Lorann.
	 */
	private void updateLoranMobile() {

		loranMobile.move();
	}

	/**
	 * TAdapter.
	 * @author Alyssa.
	 *
	 */
	private class TAdapter extends KeyAdapter {

		@Override
		public void keyReleased(KeyEvent e) {
			loranMobile.keyReleased(e);
		}

		@Override
		public void keyPressed(KeyEvent e) {
			loranMobile.keyPressed(e);

		}
	}
}
