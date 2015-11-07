import greenfoot.*;

/**
 * Write a description of class BossHealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossHealth extends Actor
{
    public int damage = 0;// added per contact with a shot
    GreenfootImage current = new GreenfootImage("BossFullLife.png");
    GreenfootImage one = new GreenfootImage("BossLife(1).png");
    GreenfootImage two = new GreenfootImage("BossLife(4).png");
    GreenfootImage three = new GreenfootImage("BossLife(5).png");
    GreenfootImage four = new GreenfootImage("BossLife(7).png");
    GreenfootImage five = new GreenfootImage("BossLife(9).png");
    GreenfootImage six = new GreenfootImage("BossLife(11).png");
    GreenfootImage seven = new GreenfootImage("BossLife(13).png");
    GreenfootImage eight = new GreenfootImage("BossLife(15).png");
    GreenfootImage nine = new GreenfootImage("BossLife(17).png");
    GreenfootImage ten = new GreenfootImage("BossLife(Dead).png");
   
    /**
     * Act - do whatever the BossHealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public BossHealth()// Zarah G. Boss Health
    {
        setImage(current);
    }
    public void damageHit()// changes images when called
    {
        if (damage == 2)
        {

            setImage(one);
        }
         if (damage == 4)
        {

            setImage(two);
        }
         if (damage == 6)
        {

            setImage(three);
        }
         if (damage == 8)
        {

            setImage(four);
        }
         if (damage == 10)
        {

            setImage(five);
        }
         if (damage == 12)
        {

            setImage(six);
        }
         if (damage == 14)
        {

            setImage(seven);
        }
         if (damage == 16)
        {

            setImage(eight);
        }
         if (damage == 18)
        {

            setImage(nine);
        }
         if (damage == 20)
        {

            setImage(ten);
        }
        
    }
 
}
