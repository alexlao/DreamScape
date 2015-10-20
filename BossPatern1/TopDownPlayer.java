import greenfoot.*;
import java.lang.Math;

/**
 * The player when the game is in top-down view.
 *
 * The player is controlled by the keyboard's arrow keys.
 */
public class TopDownPlayer extends Actor
{
    public int playerSpeed = 5;
    public int playerTurnSpeed = 3;
    public  int shotTimer = 0;
    private GreenfootImage shot= new GreenfootImage("Topdownshot.png");
    private GreenfootImage noShot= new GreenfootImage("topdown.png");
    // private Playerhitbox phb;
    //  int stationaryX;

    public void act()
    {
        moveAndTurn();
        shoot();

        //kill();
    }
    // 
    //     protected void addedToWorld (World w)
    //     {
    //         stationaryX = getX();
    //         phb = new Playerhitbox(this, 10 ,25 ,10 ,5 , true);
    //         getWorld().addObject(phb,getX(), getY());
    //     }

    /**
     * Reads the keyboard's arrow keys to determine how to move and turn the
     * player
     */
    public void moveAndTurn()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            move(playerSpeed);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            move((int)Math.round(-playerSpeed * .75));
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-playerTurnSpeed);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(playerTurnSpeed);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 3 , getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3 , getY());
        }
    }

    public void shoot()
    { 
        if(shotTimer < 10)
        {
            setImage(noShot);
        }
        if(shotTimer >  0)
        {
            shotTimer--;
        }
        else if(Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Shot(this), getX(), getY());
            shotTimer = 50;
            setImage(shot);

        }

        if(isTouching(BossShot.class))
        {
            removeTouching(BossShot.class);

            //health(1);
        }

        if(isTouching(BossShot2.class))
        {
            removeTouching(BossShot2.class);

            //health(1);
        }
    }

}
