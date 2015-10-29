import greenfoot.*;

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends ScrollingActor
{
    private int healthCount = 0;
    private int turnAmount = 0;
    private GreenfootImage shot = new GreenfootImage ("Shootspider2.png");
    private GreenfootImage noShot = new GreenfootImage ("Shootspider1.png");
    public void act() 
    {
        pattern();
        //health();
        death();
    }    

    public void health()
    {
        if(isTouching(Bullet1.class))
        {
            removeTouching(Bullet1.class);

            health(1);
        }
    }

    public void health(int amount)
    {
        this.healthCount += amount;
    }

    public void death()
    {
        if (healthCount == 1)
        {
            Actor Enemy2;
            Enemy2 = getOneObjectAtOffset(0,0, Enemy2.class);
            World world;
            world = getWorld();
            world.removeObject(Enemy2);
        }
    }   

    public void turnCount(int amount)
    {
        this.turnAmount += amount;
    }

    public void pattern()
    {
        if (turnAmount >= 0 && turnAmount < 200)
        {
            setLocation(getX() + 2 , getY());
            turnCount(1);
        }

        if(turnAmount >= 200 && turnAmount <300)
        {
            if(turnAmount == 225)
            {
                fire1();
                setImage(shot);
            }
            if(turnAmount == 255 )
            {
                setImage(noShot);
                getImage().mirrorHorizontally();
            }

            turnCount(1);         
        }

        if(turnAmount >= 300 &&  turnAmount < 500)
        {
            setLocation(getX() - 2  , getY());
            turnCount(1);            
        }

        if(turnAmount >= 500 && turnAmount <600)
        {
            if(turnAmount == 520 )
            {
                setImage(shot);
                fire2();
                
            }

            if(turnAmount == 570 )
            {
                setImage(noShot);
                getImage().mirrorHorizontally();
            }
            turnCount(1);            
        }

        if(turnAmount == 600)
        {
            turnCount(-600);

        }
    }

    public void fire1()
    {
        getWorld().addObject(new Bullet1(this), getX(), getY());
    }

    public void fire2()
    {
        getWorld().addObject(new Bullet2(this), getX(), getY());
    }
}
