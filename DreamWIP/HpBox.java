import greenfoot.*;

/**
 * Write a description of class HpBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HpBox extends PerkBox
{
    public Counter c;
    public HpBox(Counter s)
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
