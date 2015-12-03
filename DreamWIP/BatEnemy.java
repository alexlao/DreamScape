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
    GreenfootImage boom = new GreenfootImage("Boom.png");
    
    public BatEnemy(TopDownPlayer p, Counter c)
    {
        Hero = p;
        score = c;
    }
    public void act() 
    {
        if(getImage() != boom)
        {
          movement(Hero,1);
          checkForCollisions();
        }
        timercountdown(3);
    } 
    
    public void checkForCollisions()
    {
            try{
        if(isTouching(Shot.class))
        {
            delay = 7;
            
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

            if(delay == 6)
            {
                
                //splat.play();
                setImage(boom);
                
            }
            if(delay == 1)
            {
               getWorld().removeObject(this);
               score.gainPoints(add);
            }
            
    }
}
}
