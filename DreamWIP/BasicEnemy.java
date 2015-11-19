import greenfoot.*;


public class BasicEnemy extends TDEnemy
{
    private TopDownPlayer Hero;
    Counter score;
    int delay;
    public BasicEnemy(TopDownPlayer p, Counter c)
    {
        Hero = p;
        score = c;
    }
    public void act() 
    {
        movement(Hero,1);
        checkForCollisions();
        timercountdown(1);
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
                //GreenfootSound splat = new GreenfootSound("Splat.mp3");
                //splat.play();
                //setImage(dead);
                
            }
            if(delay == 1)
            {
               getWorld().removeObject(this);
               score.gainPoints(add);
            }
            
        }
    }
  
}
