import greenfoot.*;

/**
 * Write a description of class FinalCutsceneTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalCutsceneTwo extends ScrollWorld
{
    Counter score;
    Lives lives;
    public FinalCutsceneTwo()
    {
        super(1000, 600,1, 1500, 600);
        Counter score = new Counter(0);
        lives = new Lives();
        prepare();
    }
    
    public void prepare()
    {
        Allistar allistar = new Allistar(score, lives);
        addObject(allistar, 50, 445);
        for(int i =  0; i  < 13; i++)
        {
            addObject(new Platform(), 65 + 100 * i,  480);
        }
        addObject(new Platform(), 1365, 530);
        addObject(new Platform(), 1465, 530);
        Portal portal = new Portal();
        addObject(portal, 1444, 475);
    }
    
    public void nextWorld()
    {
        Greenfoot.setWorld(new FinalCutsceneThree());
    }
}
