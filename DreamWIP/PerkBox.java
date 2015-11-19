import greenfoot.*;

/**
 * Write a description of class PerkBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PerkBox extends Actor
{
    //Timer disappear = new Timer(true);
    public PerkBox()
    {
        
    }
    public void act() 
    {
       
    }    
    
    public void fade()
    {
        
      // if (disappear.getElapsedTime() == 1)
       // {
      //      getWorld().removeObject(this);
      // } 
    }
    
    public void checkPlayer()
    {
        Actor player = getOneIntersectingObject(TopDownPlayer.class);
        if (player != null)
        {
            getWorld().removeObject(this);
        }
    }
}
