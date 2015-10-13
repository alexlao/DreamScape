import greenfoot.*;

/**
 * Write a description of class Builder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Builder extends World
{

    /**
     * Constructor for objects of class Builder.
     * 
     */
    public Builder()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        prepare();
    }
    public void prepare()
    {
        Platform platform1 = new Platform();
        addObject(platform1,300,500);
    }
 
}
