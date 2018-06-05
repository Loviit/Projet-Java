package model.mobile;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * <h1>The Class ShootingMissiles is the class that executes the transaction
 * type..</h1>
 *
 * @author Alyssa BINARD
 * @version 1.0
 */
public class ShootingMissiles extends JFrame {

	/** The serialVersionID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates ShootingMissiles
	 */
	public ShootingMissiles() {

		initUI();
	}

	/**
	 * Initialized the windows.
	 */
	private void initUI() {

		add(new Board());

		setSize(800, 600);
		setResizable(false);

		setTitle("Lorann");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * The main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			ShootingMissiles ex = new ShootingMissiles();
			ex.setVisible(true);
		});
	}
}
