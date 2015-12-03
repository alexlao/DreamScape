import greenfoot.*;

/**
 * Write a description of class poop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poop extends Enemy
{
    Level3Enemy1 b;
    public poop(Level3Enemy1 bird)
    {
        b = bird;
    }
    public void act() 
    {
        try{
        setLocation(b.getX(), getY() + 5);
    }
    catch (Exception E)
    {
        setLocation(getX(), getY() + 5);
    }
    }    
}
