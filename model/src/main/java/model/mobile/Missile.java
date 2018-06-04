package model.mobile;

public class Missile extends Sprite {

	private final int MISSILE_SPEED = 32;
    private Boolean tirer=false;
    private String directions;

    public Missile(int x, int y, int direction) {
        super(x, y);
        
        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("../sprite/fireball.gif");  
        getImageDimensions();
    }

    public void move(int direction) {
        
     //   x += MISSILE_SPEED;
      //  x -= MISSILE_SPEED;
        //trouver la suite
        if (direction == 1) {
        	x -= MISSILE_SPEED;
        	y = 0;
        }
        
        if (direction == 2) {
        	x += MISSILE_SPEED;
        	y = 0;
        }
        
        if (direction == 3) {
        	y += MISSILE_SPEED;
        	x = 0;
        }
        if (direction == 4) {
        	y -= MISSILE_SPEED;
        	x = 0;
        }
      
    }
}