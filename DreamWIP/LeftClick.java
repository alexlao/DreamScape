import greenfoot.*;

/**
 * Write a description of class LeftClick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftClick extends Actor
{
    
    GifImage leftClick = new GifImage("resized.gif");
    GreenfootImage left;
    /**
     * Act - do whatever the LeftClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    setImage(leftClick.getCurrentImage());
    }
}
