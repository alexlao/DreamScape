import greenfoot.*;

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends ScrollingActor
{
    GifImage portalImage = new GifImage("Blue portal.gif");
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(portalImage.getCurrentImage());
    }    
}
