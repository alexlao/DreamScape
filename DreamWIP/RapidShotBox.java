import greenfoot.*;

/**
 * Write a description of class RapidShotBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RapidShotBox extends PerkBox
{
    Counter c;
    public RapidShotBox(Counter s)
    {
        c = s;
    }
    public void act() 
    {
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
