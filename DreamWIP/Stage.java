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
    Counter counter;
    int z;
    private GreenfootSound bkgMusic; 
    /**
     * Constructor for objects of class Stage.
     * 
     */
    public Stage(Counter count, int totalCount, Lives lives)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        bkgMusic = new GreenfootSound("sounds/Spidermusic.mp3");
        bkgMusic.playLoop();
        counter = new Counter(totalCount);
        prepare();

    }

    //     public void musiolor (int amount)
    //     {
    //         this.brickType += amount;
    //     }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Boss boss = new Boss(counter);
        addObject(boss, 302, 31);

        TopDownPlayer topdownplayer = new TopDownPlayer();
        addObject(topdownplayer, 301, 353);
        addObject(counter, 36, 12);
        topdownplayer.setLocation(305, 555);
    }

    public void goToShop()
    {
        int totalCount = counter.returnValue();
        Shop shop = new Shop(totalCount);
        Greenfoot.setWorld(shop);
    }
}
