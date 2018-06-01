package view;

import java.awt.Color;
import java.awt.GridLayout;

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
   
	public ViewFacade() {
        super();
        JFrame window = new JFrame();
        String level = new String("NNFFGGGGGGGGGGGGGGGFNFFNNNNNNNNNNNNNNANHFFNNNNNNNNNNNNNNNNNHFNDNFGGGGGGGFMFNFGGFHNNNHNNNNJNNNNHNNNNHHNNNHNFGGGGGGGFGGFNHHNNNHNNNNLNNNMHNNNNHHNNNFGGGGGGGFNFNFGGFHNNNHNNNNKNNNMHNNNNHFGFNHNFGGGGGGFFGGFNHHCNNHNNNNINNMHMNMNNHFGGGFGGGGGGGGFGGGGGF");
        window.setSize(769, 468);
        window.setTitle("Lorann Game");
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        pan.setBackground(Color.BLACK);
        pan.setLayout(new GridLayout(12, 20));

        for (int i = 0; i != 240; i++)
        {
            char caracter = level.charAt(i);
            switch (caracter)
            {
                case 'A': 
                    Icon laurann = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\Laurann.gif");
                    JLabel l = new JLabel();
                    l.setIcon(laurann); 
                    pan.add(l);
                    break;
                case 'B': 
                    Icon fireball = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\fireball.gif");
                    JLabel f1 = new JLabel();
                    f1.setIcon(fireball); 
                    pan.add(f1);
                    break;
                case 'C': 
                    Icon crystall_ball = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\crystal_ball.png");
                    JLabel c = new JLabel();
                    c.setIcon(crystall_ball); 
                    pan.add(c);
                    break;
                case 'D': 
                    Icon gate_closed = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\gate_closed.png");
                    JLabel gc = new JLabel();
                    gc.setIcon(gate_closed); 
                    pan.add(gc);
                    break;
                case 'E': 
                    Icon gate_open = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\gate_open.png");
                    JLabel go = new JLabel();
                    go.setIcon(gate_open); 
                    pan.add(go);
                    break;
                case 'F':
                    Icon bone = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\bone.png");
                    JLabel bo = new JLabel();
                    bo.setIcon(bone); 
                    pan.add(bo);
                    break;
                case 'G': 
                    Icon bone_horizontal = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\horizontal_bone.png");
                    JLabel bh = new JLabel();
                    bh.setIcon(bone_horizontal); 
                    pan.add(bh); 
                    break;
                case 'H': 
                    Icon vertical_bone = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\vertical_bone.png");
                    JLabel vb = new JLabel();
                    vb.setIcon(vertical_bone); 
                    pan.add(vb); 
                    break;
                case 'I':          
                    Icon monster_1 = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\monster_1.png");
                    JLabel m1 = new JLabel();
                    m1.setIcon(monster_1); 
                    pan.add(m1); 
                    break;
                case 'J':          
                    Icon monster_2 = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\monster_2.png");
                    JLabel m2 = new JLabel();
                    m2.setIcon(monster_2); 
                    pan.add(m2); 
                    break;
                case 'K':          
                    Icon monster_3 = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\monster_3.png");
                    JLabel m3 = new JLabel();
                    m3.setIcon(monster_3); 
                    pan.add(m3); 
                    break;
                case 'L':          
                    Icon monster_4 = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\monster_4.png");
                    JLabel m4 = new JLabel();
                    m4.setIcon(monster_4); 
                    pan.add(m4); 
                    break;
                case 'M': 
                    Icon purse = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\purse.png");
                    JLabel p = new JLabel();
                    p.setIcon(purse); 
                    pan.add(p);
                    break;
                case 'N':
                    Icon empty = new ImageIcon("C:\\Users\\Daynalnir\\Desktop\\sprite\\empty.png");
                    JLabel empt = new JLabel();
                    empt.setIcon(empty); 
                    pan.add(empt);
                    break;
            } 
        }
        window.getContentPane().add(pan);
        window.setVisible(true);  
        }

    

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	String map = "";
	
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
        System.out.println("|Passage View| ");
        
        StringBuffer map = new StringBuffer(message);
        map.delete(0, 4);
      
        System.out.println(map);
    }

}
