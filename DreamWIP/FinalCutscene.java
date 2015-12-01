import greenfoot.*;

/**
 * Write a description of class FinalCutscene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalCutscene extends ScrollWorld
{
    Counter score;
    Lives lives;
    Timer time;
    public FinalCutscene(Timer t)
    {
        super(1000, 600,1, 1500, 600);
        Counter score = new Counter(0);
        lives = new Lives();
        prepare();
        time = t;
    }
    
    public void prepare()
    {
        Allistar allistar = new Allistar(score, lives);
        addObject(allistar, 370, 550);
        for(int i =  0; i  < 15; i++)
        {
            addObject(new Platform(), 65 + 100 * i,  585);
        }
        Portal portal = new Portal();
        addObject(portal, 1444, 530);
    }

    public void nextWorld()
    {
        Greenfoot.setWorld(new FinalCutsceneTwo(time));
    }
}
