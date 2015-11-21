import greenfoot.*;

/**
 * Write a description of class poop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poop extends Enemy
{
    /**
     * Act - do whatever the poop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 5);
    }    
}
