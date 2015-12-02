import greenfoot.*;

/**
 * Write a description of class Weapon3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot3Still extends Actor
{
    /**
     * Act - do whatever the Weapon3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage shot3 = new GifImage("Shot3.gif");
    public void act() 
        {
         setImage(shot3.getCurrentImage());
    }    
}