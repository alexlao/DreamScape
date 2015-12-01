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
    
    public GameOver(Allistar player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        a = player;
        showText("Game Over",getWidth()/2, getHeight()/2);
        x = td1.purchasedAmount();
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            if(a.getSave() == 0)
            {
             Greenfoot.setWorld(new LevelOne());
            }
            if(a.getSave() == 1)
            {
                
                Greenfoot.setWorld(new LevelTwo(a.getScore(), new Lives(),new Timer(), x));
                
            }
        }
        
    }
    
}
