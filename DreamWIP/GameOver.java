import greenfoot.*;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    Allistar a;
    TopDownPlayer td1;
    int x;
    GreenfootSound music;
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        //a = player;
        music = new GreenfootSound("SoloDolo.mp3");
        music.playLoop();
        //x = td1.purchasedAmount();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("l"))
        {
            music.stop();
            reset();
        }
        if (Greenfoot.isKeyDown("p"))
        {
            System.out.print("You found an Easter egg Congratulations! You still died though.");
            
        }
    }

    public void reset()
    {
        Greenfoot.setWorld(new LevelOne(new Lives()));
    }
}
