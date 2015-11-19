import greenfoot.*;

/**
 * Write a description of class BatEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BatEnemy extends TDEnemy
{
    private TopDownPlayer Hero;
    Counter score;
    int delay;
    
    public BatEnemy(TopDownPlayer p, Counter c)
    {
        Hero = p;
        score = c;
    }
    public void act() 
    {
        movement(Hero, 2);
        checkForCollisions();
        timercountdown(2);
    } 
    
    public void checkForCollisions()
    {
            try{
        if(isTouching(Shot.class))
        {
            delay = 5;
            
            //getWorld().removeObject(this);
            
            
        }
        }
        catch(Exception e)
        {
            //getWorld().removeObject(this);
       } 
    }
    public void timercountdown(int add)
    {
                {
            if(delay > 0)
            {
                delay--;
            }

            if(delay == 3)
            {
                
                //splat.play();
                setImage("Boom.png");
                
            }
            if(delay == 1)
            {
               getWorld().removeObject(this);
               score.gainPoints(add);
            }
            
    }
}
}
