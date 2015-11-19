import greenfoot.*;

/**
 * Write a description of class White here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class White extends World
{

    /**
     * Constructor for objects of class White.
     * 
     */
    public White()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 1500, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Thing thing = new Thing();
        addObject(thing, 299, 193);
        Filter filter = new Filter(thing);
        addObject(filter, 0, 0);
    }
}
