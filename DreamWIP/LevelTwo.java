import greenfoot.*;

/**
 * Write a description of class LevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwo extends ScrollWorld
{

    /**
     * Constructor for objects of class LevelTwo.
     * 
     */
    public LevelTwo(Counter score, Lives hp)
    {
        super(1000,600,1,4000,600);
        addObject(score, 36, 12);
        addObject(hp, 920, 25);
    }
}
