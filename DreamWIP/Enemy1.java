import greenfoot.*;

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{
    private int healthCount = 0;
    private int turnAmount = 0;

    public void act() 
    {
        pattern();
        health();
        death();
    }    

    public void health()
    {
        if(isTouching(Bullet1.class))
        {
            health(1);
            removeTouching(Bullet1.class);

    
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
            Actor Enemy1;
            Enemy1 = getOneObjectAtOffset(0,0, Enemy1.class);
            World world;
            world = getWorld();
            world.removeObject(Enemy1);
        }
    }

    public void pattern()
    {
        if (turnAmount >= 0 && turnAmount <= 150)
        {
            setLocation(getX() + 2 , getY());
            turnCount(1);
        }
        
        if(turnAmount == 150)
        {
           getImage().mirrorHorizontally(); 
        }
        
        if(turnAmount > 150)
        {
            setLocation(getX() - 2  , getY());
            turnCount(1);
            if(turnAmount == 300)
            {
                getImage().mirrorHorizontally();
                turnCount(-300);
            }
        }

    }

    public void turnCount(int amount)
    {
        this.turnAmount += amount;
    }
}
