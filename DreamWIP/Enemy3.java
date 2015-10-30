import greenfoot.*;
import java.util.*;
import java.lang.Math;

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends ScrollingActor
{
    private int healthCount = 0;
    private int turnAmount = 0;
    private int shootTime = 200;
    private int playerX = 0;
    private GreenfootImage shot = new GreenfootImage ("Followspider2.png");
    private GreenfootImage noShot = new GreenfootImage ("Followspider1.png");

    public void act() 
    {
        //patternSet();
        //health();
        // death();
        shootAmount();
    }    

    public void health()
    {
        if(isTouching(Bullet1.class))
        {
            removeTouching(Bullet1.class);

            health(1);
        }
    }

    public void shootAmount()
    {
        if(shootTime > 200)
        {

            shootTime -- ;
        }
        else
        {

            fire3();
            shootTime += 100;
        }
        if(shootTime < 380)
        {
            setImage(noShot);
        }
        if(shootTime <= 210 || shootTime >= 380)
        {
            setImage(shot);
        }
    }

    public void health(int amount)
    {
        this.healthCount += amount;
    }

    public void turnCount(int amount)
    {
        this.turnAmount += amount;
    }

    public void death()
    {
        if (healthCount == 1)
        {
            Actor Enemy3;
            Enemy3 = getOneObjectAtOffset(0,0, Enemy3.class);
            World world;
            world = getWorld();
            world.removeObject(Enemy3);
        }
    }  

    public int playerXAmount()
    {
        Actor Player;
        Player = getOneObjectAtOffset(0, 0, Allistar.class);
        return playerX;
        //Player = getOneObjectAtOffset(20, 0, Player.class);
    }
    /*
    public void patternSet()
    {
        
        List players = getObjectsInRange(200, Allistar.class);
        if (!players.isEmpty())
        {
            Actor player = (Actor)players.get(0);
            int diffX = player.getX()-getX();
            setLocation(getX()+2*(int)Math.signum(diffX), getY());
        }
    }
    */

    public void fire3()
    {
        getWorld().addObject(new Bullet3(this), getX(), getY());
    }

}


