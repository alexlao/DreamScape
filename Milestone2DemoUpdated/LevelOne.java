import greenfoot.*;

/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends ScrollWorld
{

    /**
     * Constructor for objects of class LevelOne.
     * 
     */
    public LevelOne()
    {
        super(600, 600, 1, 1800, 600);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform, 95, 509);
        Platform platform2 = new Platform();
        addObject(platform2, 256, 451);
        Platform platform3 = new Platform();
        addObject(platform3, 431, 385);
        Platform platform4 = new Platform();
        addObject(platform4, 607, 450);
        Platform platform5 = new Platform();
        addObject(platform5, 750, 349);
        Platform platform6 = new Platform();
        addObject(platform6, 884, 287);
        Platform platform7 = new Platform();
        addObject(platform7, 1002, 211);
        Platform platform8 = new Platform();
        addObject(platform8, 1171, 465);
        Allistar allistar = new Allistar();
        addObject(allistar, 81, 410);
    }
}
