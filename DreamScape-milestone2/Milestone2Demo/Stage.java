import greenfoot.*;

/**
 * Write a description of class Stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage extends World
{
    //private Counter theCounter;

    /**
     * Constructor for objects of class Stage.
     * 
     */
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();

    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Boss boss = new Boss();
        addObject(boss, 302, 31);


        TopDownPlayer topdownplayer = new TopDownPlayer();
        addObject(topdownplayer, 301, 353);

        topdownplayer.setLocation(305, 555);
    }
    
    public void goToShop()
    {
        Shop shop = new Shop();
        Greenfoot.setWorld(shop);
    }
}
