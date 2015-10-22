import greenfoot.*;

/**
 * Write a description of class TestShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestShooter extends World
{
    private Counter testCounter;
    /**
     * Constructor for objects of class TestShooter.
     * 
     */
    public TestShooter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        testCounter = new Counter(0);
        addObject(testCounter, 100, 200);
    }
    
    public Counter getCounter(){
        //gets counter, similar to lab exercise
        return testCounter;
    }
    public void act()
    {
       changeWorld();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Wombat wombat = new Wombat();
        addObject(wombat, 379, 292);
        Wombat wombat2 = new Wombat();
        addObject(wombat2, 374, 209);
        Alligator alligator = new Alligator();
        addObject(alligator, 197, 254);
        Wombat wombat3 = new Wombat();
        addObject(wombat3, 499, 171);

    }

    public void changeWorld(){
        //goes to new world when all monsters are destroyed. should be used for boss stage --> shop translation
    if (numberOfObjects()==2)
    {
        
        Greenfoot.setWorld(new Shop(testCounter, testCounter.returnValue()));
        
    }
    }
    
    public TestShooter getShooter()
    {
        return this;
    }
}
