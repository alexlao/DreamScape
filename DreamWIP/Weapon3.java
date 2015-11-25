import greenfoot.*;

/**
 * Write a description of class Weapon3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon3 extends Actor
{
    /**
     * Act - do whatever the Weapon3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage shot1 = new GifImage("NewShot.gif");
    public void act() 
        {
         setImage(shot1.getCurrentImage());
    }    
}
