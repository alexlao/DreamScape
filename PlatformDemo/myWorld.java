import greenfoot.*;

/**
 * Write a description of class myWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myWorld extends ScrollingWorld
{

    /**
     * Constructor for objects of class myWorld.
     * 
     */
    public myWorld()
    {
        Platform p1 = new Platform();
        addObject(p1,300,200);
        Platform p2 = new Platform();
        addObject(p2,500,200);
    }
}
