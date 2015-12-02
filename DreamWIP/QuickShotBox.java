import greenfoot.*;

/**
 * Write a description of class QuickShotBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickShotBox extends PerkBox
{
    Counter c;
    public QuickShotBox(Counter s)
    {
        c = s;
    }
    public void act() 
    {
      // fade();
      checkPlayer();
      
    }    
    
    public void checkPlayer()
    {
        Actor player = getOneIntersectingObject(TopDownPlayer.class);
        if (player != null)
        {
            getWorld().removeObject(this);
            c.subtract();
           
    
        }
    }
    }
    
    

