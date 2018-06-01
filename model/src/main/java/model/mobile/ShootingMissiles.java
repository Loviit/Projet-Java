package model.mobile;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ShootingMissiles extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShootingMissiles() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setSize(400, 300);
        setResizable(false);
        
        setTitle("Shooting missiles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            ShootingMissiles ex = new ShootingMissiles();
            ex.setVisible(true);
        });
    }
}
