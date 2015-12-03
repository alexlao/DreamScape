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
    
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        //a = player;
        //x = td1.purchasedAmount();
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("l"))
        {

             Greenfoot.setWorld(new LevelOne());
            }
        }
        
    }
    