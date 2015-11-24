import greenfoot.*;

/**
 * Write a description of class BrokenPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrokenPlatform extends Platform
{
    int time = 0;
    GreenfootImage one = new GreenfootImage("b2.png");
    GreenfootImage two = new GreenfootImage("b3.png");
    GreenfootImage three = new GreenfootImage("b4.png");
    GreenfootImage four = new GreenfootImage("b5.png");
    GreenfootImage five = new GreenfootImage("b6.png");
    GreenfootImage six = new GreenfootImage("b7.png");
    GreenfootImage seven = new GreenfootImage("b8.png");
    GreenfootImage eight = new GreenfootImage("b9.png");
    
    /**
     * Act - do whatever the BrokenPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Break();
        time--;
    }    
    public void Break()
    {
        if (isTouching(Allistar.class))
        {
            time = 70;
        }
        if (time == 63  )
        {
            setImage(one);
        } else if (time == 56 )
        {
            setImage(two);
        } else if (time == 49 )
        {
            setImage(three);
        } else if (time == 42 )
        {
            setImage(four);
        } else if (time == 35 )
        {
            setImage(five);
        } else if (time == 28 )
        {
            setImage(six);
        } else if (time == 21 )
        {
            setImage(seven);
        } else if (time == 14 )
        {
            setImage(eight);
        } else if (time == 7)
        {
            getWorld().removeObject(this);
        }
    }
}
