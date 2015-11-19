import greenfoot.*;

/**
 * Write a description of class TopDownGameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopDownGameOver extends World
{

    /**
     * Constructor for objects of class TopDownGameOver.
     * 
     */
    public TopDownGameOver(int score)
    {   
        super(600, 400, 1); 
        showText("Game Over",getWidth()/2, getHeight()/2);
        showText("Your Score: " + score, getWidth()/2, getHeight()/2 + 50);
        showText("Press Space to go back...", getWidth()/2, getHeight()/2 + 100);
        
        
    }
    public void act()
    {
      if (Greenfoot.isKeyDown("space"))
        {
           StartMenu start = new StartMenu();
           Greenfoot.setWorld(start);
           
        }
}
}
