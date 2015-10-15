import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{

    private int vSpeed = 0;//fall speed
    private int accel = 2; //gravity acceleration
    private int jumpCount = 0;
    private boolean inAir;
    private int jumpHeight2 = 23;
    private int jumpHeight1 = 18;

    public void act() 
    {
        movement();
        checkFall();
    } 

    //Method to walk right and left and jump
    public void movement()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }

        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
        }

        if(Greenfoot.isKeyDown("w"))
        {
            jump();
            jumpAmount(1);
        }

    }

    //jump height tester
    public void jumpAmount(int amount)
    {
        this.jumpCount += amount;
    }

    //Method for jumping. If you are not in the air, you will essentially have "negative" gravity, then fall
    public void jump()
    {

        if(jumpCount >=1 && jumpCount <=2)
        {
            if (inAir == false)
            {
                vSpeed = vSpeed - jumpHeight1;
                inAir = true;
                fall();
                jumpCount = 0;
            }
        }

        if(jumpCount >=3)
        {
            if (inAir == false)
            {
                vSpeed = vSpeed - jumpHeight2;
                inAir = true;
                fall();
                jumpCount = 0;
            }
        }

    }

    //Method for falling
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if (vSpeed <= 9)
        {
            vSpeed = vSpeed + accel; //fall speed gets larger by accel every tick
        }

        inAir = true;
    }

    //checks to see if player is on ground
    public boolean checkGround()
    {
        int pHeight = getImage().getHeight();
        int onGround = (int)(pHeight/2);

        Actor ground = getOneObjectAtOffset(0, onGround, Platform.class);

        //if pjlayer is on nothing, return false, else return true
        if(ground == null)
        {
            inAir = true;
            return false;
        }
        else
        {
            inAir = false;
            return true;
        }
    }

    //if the player is on the ground, "turn off" gravity. Otherwise fall
    public void checkFall()
    {
        if(checkGround() == true)
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }

    }

}
