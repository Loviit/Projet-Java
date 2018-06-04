package model.mobile;

public class Missile extends Sprite {

	private final int MISSILE_SPEED = 32;
	private Boolean tirer = false;
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