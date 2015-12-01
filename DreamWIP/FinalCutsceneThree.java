import greenfoot.*;

/**
 * Write a description of class FinalCutsceneThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalCutsceneThree extends ScrollWorld
{
    Counter score;
    Lives lives;
    Timer time;
    public FinalCutsceneThree(Timer t)
    {
        super(1500, 600,1, 1500, 600);
        Counter score = new Counter(0);
        lives = new Lives();
        prepare();
        time = t;
    }
    
    public void prepare()
    {
        Allistar allistar = new Allistar(score, lives);
        addObject(allistar, 65, 520);
        for(int i =  0; i  < 15; i++)
        {
            addObject(new Platform(), 65 + 100 * i,  555);
        }
        Portal portal = new Portal();
        addObject(portal, 1470, 334);
        portal.setLocation(1469, 320);
        portal.setLocation(1471, 303);
        portal.setLocation(1473, 284);
        portal.setLocation(1473, 299);
        portal.setLocation(1473, 304);
        portal.setLocation(1475, 307);
        portal.setLocation(1475, 303);
        portal.setLocation(1477, 291);
        portal.setLocation(1477, 297);
        portal.setLocation(1481, 297);
        portal.setLocation(1485, 296);
        portal.setLocation(1485, 297);
    }


    public void nextWorld()
    {
        Greenfoot.setWorld(new End(time));
    }

}
