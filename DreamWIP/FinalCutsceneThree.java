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
    public FinalCutsceneThree()
    {
        super(1000, 600,1, 1500, 600);
        Counter score = new Counter(0);
        lives = new Lives();
        prepare();
    }
    
    public void prepare()
    {
        Allistar allistar = new Allistar(score, lives);
        addObject(allistar, 65, 520);
        for(int i =  0; i  < 15; i++)
        {
            addObject(new Platform(), 65 + 100 * i,  555);
        }
    }
}
