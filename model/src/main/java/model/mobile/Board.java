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

public class Board extends JPanel implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = -8246000947640347114L;
    private final int ICRAFT_X = 40;
    private final int ICRAFT_Y = 60;
    private final int DELAY = 150;
    private Timer timer;
    private LorannMobile loranMobile;

    /**
     * Instantiates a new Board.
     */
    public Board() {

        initBoard();
    }

    
    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        loranMobile = new LorannMobile(ICRAFT_X, ICRAFT_Y);

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(loranMobile.getImage(), loranMobile.getX(),
                loranMobile.getY(), this);

        List<Missile> missiles = loranMobile.getMissiles();

        for (Missile missile : missiles) {

            g2d.drawImage(missile.getImage(), missile.getX(),
                    missile.getY(), this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        updateMissiles();
        updateLoranMobile();

        int valeur1=loranMobile.Methode();
        loranMobile.loadImage(valeur1);

        repaint();
    }
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

    private void updateLoranMobile() {

        loranMobile.move();
    }

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
