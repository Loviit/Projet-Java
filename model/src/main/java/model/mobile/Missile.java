package model.mobile;

/**
 * <h1>The Class Missile allows the mobility of missile.</h1>
 *
 * @author Alyssa BINARD
 * @version 1.0
 */
public class Missile extends Sprite {
	
	/** The Missile speed. */
	private final int MISSILE_SPEED = 32;
	/** The shoot. */
	private Boolean tirer = false;
	/** The direction. */
	private String directions;

	/**
	 * Instantiates a new Missile
	 * 
	 * @param x
	 * @param y
	 * @param direction
	 */
	public Missile(int x, int y, int direction) {
		super(x, y);

		initMissile();
	}

	/**
	 * initializes the Missile.
	 */
	private void initMissile() {

		loadImage("../sprite/fireball.gif");
		getImageDimensions();
	}
	

	/**
	 * The move of the Missile.
	 * @param direction
	 */
	public void move(int direction) {
        
     //   x += MISSILE_SPEED;
      //  x -= MISSILE_SPEED;
    	
      if(tirer==true) {
          if(directions == "RIGHT") {
          x += MISSILE_SPEED;
            }
          if(directions == "LEFT") {
              x -= MISSILE_SPEED;
                }
                if(directions == "DOWN") {
                    y += MISSILE_SPEED;
                }
                if(directions == "UP") {
                    y -= MISSILE_SPEED;
                }
              
      		}
      else {
          if(direction==1) { 
                 tirer = true;
                 directions="RIGHT";
              x += MISSILE_SPEED;
             }
             if(direction==2) {
                 tirer = true;
                 directions="LEFT";
              x-= MISSILE_SPEED;
             }
             if(direction==3) {
                 tirer = true;
                 directions="DOWN";
              y+=MISSILE_SPEED;
             }
             if(direction==4) {
                 tirer = true;
                 directions="UP";
              y-=MISSILE_SPEED;
             }
      }
	}
}