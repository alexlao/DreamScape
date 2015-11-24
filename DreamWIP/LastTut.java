import greenfoot.*;

/**
 * Write a description of class LastTut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastTut extends ScrollWorld
{
    Counter score = new Counter(0);
    Lives lives = new Lives();
    GreenfootSound m;
    /**
     * Constructor for objects of class LastTut.
     * 
     */
    public LastTut(GreenfootSound music)
    {
        super(1000,600,1, 1395, 600);
        Allistar allistar = new Allistar(score, lives);
        addObject(allistar, 123, 394);
        addObject(lives,920,25);
        addObject(score, 36, 12);
        prepare();
        m = music;
    }

    public void nextWorld()
    {
        Greenfoot.setWorld(new LevelOne());
        m.stop();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform, 123, 582);
        Platform platform2 = new Platform();
        addObject(platform2, 284, 547);
        Platform platform3 = new Platform();
        addObject(platform3, 420, 481);
        Platform platform4 = new Platform();
        addObject(platform4, 517, 481);
        Platform platform5 = new Platform();
        addObject(platform5, 606, 481);
        Platform platform6 = new Platform();
        addObject(platform6, 699, 534);
        Platform platform7 = new Platform();
        addObject(platform7, 807, 567);
        Platform platform8 = new Platform();
        addObject(platform8, 907, 567);
        Platform platform9 = new Platform();
        addObject(platform9, 1005, 567);
        Portal portal = new Portal();
        addObject(portal, 1022, 513);

        platform.setLocation(120, 531);
        platform2.setLocation(279, 509);
        Coin coin = new Coin();
        addObject(coin, 484, 455);
        coin.setLocation(477, 447);
        coin.setLocation(473, 446);
        coin.setLocation(471, 445);
        SleepBubble sleepbubble = new SleepBubble();
        addObject(sleepbubble, 945, 411);
    }
}
