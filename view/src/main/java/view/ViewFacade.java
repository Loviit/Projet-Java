package view;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     */
	public static  int J = 1;
	public   int posx = 0;
	public   int posy = 0; 
	public   int base = 0;
	public JPanel container;
	public String level;
	public JFrame window;
    
	public ViewFacade() {
        super();
        this.window = new JFrame();
        this.level = new String("NNFFGGGGGGGGGGGGGGGFNFFNNNNNNNNNNNNNNANHFFNNNNNNNNNNNNNNNNNHFNDNFGGGGGGGFMFNFGGFHNNNHNNNNJNNNNHNNNNHHNNNHNFGGGGGGGFGGFNHHNNNHNNNNLNNNMHNNNNHHNNNFGGGGGGGFNFNFGGFHNNNHNNNNKNNNMHNNNNHFGFNHNFGGGGGGFFGGFNHHCNNHNNNNINNMHMNMNNHFGGGFGGGGGGGGFGGGGGF");
        this.window.setSize(800, 600);
        this.window.setTitle("Lorann Game");
        this.window.setLocationRelativeTo(null);
        this.window.setResizable(false);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.container = new JPanel();
        this.container.setSize(800, 600);
        this.container.setLayout(null);
        this.container.setBackground(Color.BLACK);
        
    }
    
    /* public void initContainer() {
        JPanel panel = new JPanel();
       
        for (int i = 0; i != 23; i++)
        {
        	System.out.println(i);
        	
        	if (i/20 == J ) {
        		
        		
        		J = J+1;
        		posx = base;
        		posy = posy - 32;
        		
        	}
        	
        	else {
            char caracter = level.charAt(i); 
            switch (caracter)
            {
                case 'A': 
                    Icon laurann = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\Laurann.gif");
                    JLabel l = new JLabel();
                    l.setIcon(laurann); 
                    this.panel.add(l, posx, posy);
                    posx = posx + 32;
                    break;
                case 'B': 
                    Icon fireball = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\fireball.gif");
                    JLabel f1 = new JLabel();
                    f1.setIcon(fireball); 
                    this.panel.add(f1, posx, posy);
                    posx = posx + 32;
                    break;
                case 'C': 
                    Icon crystall_ball = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\crystal_ball.png");
                    JLabel c = new JLabel();
                    c.setIcon(crystall_ball); 
                    this.panel.add(c, posx, posy);
                    posx = posx + 32;;
                case 'D': 
                    Icon gate_closed = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\gate_closed.png");
                    JLabel gc = new JLabel();
                    gc.setIcon(gate_closed); 
                    this.panel.add(gc, posx, posy);
                    posx = posx + 32;
                    break;
                case 'E': 
                    Icon gate_open = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\gate_open.png");
                    JLabel go = new JLabel();
                    go.setIcon(gate_open); 
                    this.panel.add(go, posx, posy);
                    posx = posx + 32;
                    break;
                case 'F':
                    Icon bone = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\bone.png");
                    JLabel bo = new JLabel();
                    bo.setIcon(bone); 
                    this.panel.add(bo, posx, posy);
                    posx = posx + 32;
                    break;
                case 'G': 
                    Icon bone_horizontal = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\horizontal_bone.png");
                    JLabel bh = new JLabel();
                    bh.setIcon(bone_horizontal); 
                    this.panel.add(bh, posx, posy); 
                    posx = posx + 32;
                    break;
                case 'H': 
                    Icon vertical_bone = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\vertical_bone.png");
                    JLabel vb = new JLabel();
                    vb.setIcon(vertical_bone); 
                    this.panel.add(vb, posx, posy); 
                    posx = posx + 32;
                    break;
                case 'I':          
                    Icon monster_1 = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\monster_1.png");
                    JLabel m1 = new JLabel();
                    m1.setIcon(monster_1); 
                    this.panel.add(m1, posx, posy); 
                    posx = posx + 32;
                    break;
                case 'J':          
                    Icon monster_2 = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\monster_2.png");
                    JLabel m2 = new JLabel();
                    m2.setIcon(monster_2); 
                    this.panel.add(m2, posx, posy); 
                    posx = posx + 32;
                    break;
                case 'K':          
                    Icon monster_3 = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\monster_3.png");
                    JLabel m3 = new JLabel();
                    m3.setIcon(monster_3); 
                    this.panel.add(m3, posx, posy); 
                    posx = posx + 32;
                    break;
                case 'L':          
                    Icon monster_4 = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\monster_4.png");
                    JLabel m4 = new JLabel();
                    m4.setIcon(monster_4); 
                    this.panel.add(m4, posx, posy);
                    posx = posx + 32;
                    break;
                case 'M': 
                    Icon purse = new ImageIcon("C:\\Users\\Neo\\Desktop\\sprite\\purse.png");
                    JLabel p = new JLabel();
                    p.setIcon(purse); 
                    this.panel.add(p, posx, posy);
                    posx = posx + 32;
                    break;
                case 'N':
                    posx = posx + 32;
                    break;
              
            }
          } 
        	this.container.add(panel);
        }
        
        this.window.setVisible(true);  
        }*/
    

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
        System.out.println("|Passage View| ");
        System.out.println(message);
    }

}
